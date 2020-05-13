/*
 * WSO2 API Manager - Admin
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Admin Portal. Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.5.176/components/apimgt/org.wso2.carbon.apimgt.rest.api.admin/src/main/resources/admin-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: 0.16.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.admin.api.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.wso2.am.integration.clients.admin.api.dto.CustomAttributeDTO;
import org.wso2.am.integration.clients.admin.api.dto.MonetizationInfoDTO;
import org.wso2.am.integration.clients.admin.api.dto.ThrottleLimitDTO;
import org.wso2.am.integration.clients.admin.api.dto.ThrottlePolicyDTO;

/**
 * SubscriptionThrottlePolicyDTO
 */

public class SubscriptionThrottlePolicyDTO {
  @SerializedName("policyId")
  private String policyId = null;

  @SerializedName("policyName")
  private String policyName = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("isDeployed")
  private Boolean isDeployed = false;

  @SerializedName("defaultLimit")
  private ThrottleLimitDTO defaultLimit = null;

  @SerializedName("monetization")
  private MonetizationInfoDTO monetization = null;

  @SerializedName("rateLimitCount")
  private Integer rateLimitCount = null;

  @SerializedName("rateLimitTimeUnit")
  private String rateLimitTimeUnit = null;

  @SerializedName("customAttributes")
  private List<CustomAttributeDTO> customAttributes = null;

  @SerializedName("stopOnQuotaReach")
  private Boolean stopOnQuotaReach = false;

  @SerializedName("billingPlan")
  private String billingPlan = null;

  public SubscriptionThrottlePolicyDTO policyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

   /**
   * Id of policy
   * @return policyId
  **/
  @ApiModelProperty(example = "0c6439fd-9b16-3c2e-be6e-1086e0b9aa93", value = "Id of policy")
  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  public SubscriptionThrottlePolicyDTO policyName(String policyName) {
    this.policyName = policyName;
    return this;
  }

   /**
   * Name of policy
   * @return policyName
  **/
  @ApiModelProperty(example = "Policy1", required = true, value = "Name of policy")
  public String getPolicyName() {
    return policyName;
  }

  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  public SubscriptionThrottlePolicyDTO displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name of the policy
   * @return displayName
  **/
  @ApiModelProperty(value = "Display name of the policy")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public SubscriptionThrottlePolicyDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the policy
   * @return description
  **/
  @ApiModelProperty(value = "Description of the policy")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SubscriptionThrottlePolicyDTO isDeployed(Boolean isDeployed) {
    this.isDeployed = isDeployed;
    return this;
  }

   /**
   * Indicates whether the policy is deployed successfully or not.
   * @return isDeployed
  **/
  @ApiModelProperty(value = "Indicates whether the policy is deployed successfully or not.")
  public Boolean isIsDeployed() {
    return isDeployed;
  }

  public void setIsDeployed(Boolean isDeployed) {
    this.isDeployed = isDeployed;
  }

  public SubscriptionThrottlePolicyDTO defaultLimit(ThrottleLimitDTO defaultLimit) {
    this.defaultLimit = defaultLimit;
    return this;
  }

   /**
   * Get defaultLimit
   * @return defaultLimit
  **/
  @ApiModelProperty(value = "")
  public ThrottleLimitDTO getDefaultLimit() {
    return defaultLimit;
  }

  public void setDefaultLimit(ThrottleLimitDTO defaultLimit) {
    this.defaultLimit = defaultLimit;
  }

  public SubscriptionThrottlePolicyDTO monetization(MonetizationInfoDTO monetization) {
    this.monetization = monetization;
    return this;
  }

   /**
   * Get monetization
   * @return monetization
  **/
  @ApiModelProperty(value = "")
  public MonetizationInfoDTO getMonetization() {
    return monetization;
  }

  public void setMonetization(MonetizationInfoDTO monetization) {
    this.monetization = monetization;
  }

  public SubscriptionThrottlePolicyDTO rateLimitCount(Integer rateLimitCount) {
    this.rateLimitCount = rateLimitCount;
    return this;
  }

   /**
   * Burst control request count
   * @return rateLimitCount
  **/
  @ApiModelProperty(example = "10", value = "Burst control request count")
  public Integer getRateLimitCount() {
    return rateLimitCount;
  }

  public void setRateLimitCount(Integer rateLimitCount) {
    this.rateLimitCount = rateLimitCount;
  }

  public SubscriptionThrottlePolicyDTO rateLimitTimeUnit(String rateLimitTimeUnit) {
    this.rateLimitTimeUnit = rateLimitTimeUnit;
    return this;
  }

   /**
   * Burst control time unit
   * @return rateLimitTimeUnit
  **/
  @ApiModelProperty(value = "Burst control time unit")
  public String getRateLimitTimeUnit() {
    return rateLimitTimeUnit;
  }

  public void setRateLimitTimeUnit(String rateLimitTimeUnit) {
    this.rateLimitTimeUnit = rateLimitTimeUnit;
  }

  public SubscriptionThrottlePolicyDTO customAttributes(List<CustomAttributeDTO> customAttributes) {
    this.customAttributes = customAttributes;
    return this;
  }

  public SubscriptionThrottlePolicyDTO addCustomAttributesItem(CustomAttributeDTO customAttributesItem) {
    if (this.customAttributes == null) {
      this.customAttributes = new ArrayList<>();
    }
    this.customAttributes.add(customAttributesItem);
    return this;
  }

   /**
   * Custom attributes added to the Subscription Throttling Policy 
   * @return customAttributes
  **/
  @ApiModelProperty(example = "{}", value = "Custom attributes added to the Subscription Throttling Policy ")
  public List<CustomAttributeDTO> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<CustomAttributeDTO> customAttributes) {
    this.customAttributes = customAttributes;
  }

  public SubscriptionThrottlePolicyDTO stopOnQuotaReach(Boolean stopOnQuotaReach) {
    this.stopOnQuotaReach = stopOnQuotaReach;
    return this;
  }

   /**
   * This indicates the action to be taken when a user goes beyond the allocated quota. If checked, the user&#39;s requests will be dropped. If unchecked, the requests will be allowed to pass through. 
   * @return stopOnQuotaReach
  **/
  @ApiModelProperty(value = "This indicates the action to be taken when a user goes beyond the allocated quota. If checked, the user's requests will be dropped. If unchecked, the requests will be allowed to pass through. ")
  public Boolean isStopOnQuotaReach() {
    return stopOnQuotaReach;
  }

  public void setStopOnQuotaReach(Boolean stopOnQuotaReach) {
    this.stopOnQuotaReach = stopOnQuotaReach;
  }

  public SubscriptionThrottlePolicyDTO billingPlan(String billingPlan) {
    this.billingPlan = billingPlan;
    return this;
  }

   /**
   * define whether this is Paid or a Free plan. Allowed values are FREE or COMMERCIAL. 
   * @return billingPlan
  **/
  @ApiModelProperty(value = "define whether this is Paid or a Free plan. Allowed values are FREE or COMMERCIAL. ")
  public String getBillingPlan() {
    return billingPlan;
  }

  public void setBillingPlan(String billingPlan) {
    this.billingPlan = billingPlan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionThrottlePolicyDTO subscriptionThrottlePolicy = (SubscriptionThrottlePolicyDTO) o;
    return Objects.equals(this.policyId, subscriptionThrottlePolicy.policyId) &&
        Objects.equals(this.policyName, subscriptionThrottlePolicy.policyName) &&
        Objects.equals(this.displayName, subscriptionThrottlePolicy.displayName) &&
        Objects.equals(this.description, subscriptionThrottlePolicy.description) &&
        Objects.equals(this.isDeployed, subscriptionThrottlePolicy.isDeployed) &&
        Objects.equals(this.defaultLimit, subscriptionThrottlePolicy.defaultLimit) &&
        Objects.equals(this.monetization, subscriptionThrottlePolicy.monetization) &&
        Objects.equals(this.rateLimitCount, subscriptionThrottlePolicy.rateLimitCount) &&
        Objects.equals(this.rateLimitTimeUnit, subscriptionThrottlePolicy.rateLimitTimeUnit) &&
        Objects.equals(this.customAttributes, subscriptionThrottlePolicy.customAttributes) &&
        Objects.equals(this.stopOnQuotaReach, subscriptionThrottlePolicy.stopOnQuotaReach) &&
        Objects.equals(this.billingPlan, subscriptionThrottlePolicy.billingPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId, policyName, displayName, description, isDeployed, defaultLimit, monetization, rateLimitCount, rateLimitTimeUnit, customAttributes, stopOnQuotaReach, billingPlan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionThrottlePolicyDTO {\n");
    
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isDeployed: ").append(toIndentedString(isDeployed)).append("\n");
    sb.append("    defaultLimit: ").append(toIndentedString(defaultLimit)).append("\n");
    sb.append("    monetization: ").append(toIndentedString(monetization)).append("\n");
    sb.append("    rateLimitCount: ").append(toIndentedString(rateLimitCount)).append("\n");
    sb.append("    rateLimitTimeUnit: ").append(toIndentedString(rateLimitTimeUnit)).append("\n");
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
    sb.append("    stopOnQuotaReach: ").append(toIndentedString(stopOnQuotaReach)).append("\n");
    sb.append("    billingPlan: ").append(toIndentedString(billingPlan)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

