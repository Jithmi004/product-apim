package org.wso2.am.integration.backend.service;

import com.sun.net.httpserver.HttpsServer;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.security.KeyStore;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class SSLServerSendImmediateResponse extends AbstractSSLServer {

    public void run(int port, String content, int statusCode) throws InterruptedException {
        try {
            // Initialize the SSL context with the keystore
            SSLContext sslContext = SSLContext.getInstance("TLS");

            KeyStore keyStore = KeyStore.getInstance("JKS");
            FileInputStream fis = new FileInputStream("/Users/jithmir/Work/Product_APIM_fork_2/product-apim/modules/integration/tests-integration/tests-benchmark/src/test/resources/keystores/products/wso2carbon.jks");
            keyStore.load(fis, "wso2carbon".toCharArray());

            KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
            kmf.init(keyStore, "wso2carbon".toCharArray());

            TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");
            tmf.init(keyStore);

            sslContext.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);

            // Create an HttpsServer instance
            HttpsServer server = HttpsServer.create(new InetSocketAddress(8100), 0);
            this.setServer(server);
            server.setHttpsConfigurator(new com.sun.net.httpserver.HttpsConfigurator(sslContext));

            // Wrap the handler logic with a timeout mechanism
            server.createContext("/", exchange -> {
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<?> future = executor.submit(() -> {
                    try {
                        // Handle the request
                        new Handler(statusCode, content, true).handle(exchange);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
                executor.shutdown();

                try {
                    // Wait for completion or timeout after 10 seconds
                    future.get(10, TimeUnit.SECONDS);
                } catch (TimeoutException e) {
                    // Handle timeout: return 503 Service Unavailable
                    exchange.sendResponseHeaders(503, -1);
                    future.cancel(true);  // Cancel the task
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

            server.setExecutor(Executors.newSingleThreadExecutor());
            server.start();

            System.out.println("SSL Server is listening on port 8100...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
