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
import org.wso2.am.integration.clients.admin.api.dto.MediationInfoDTO;

/**
 * MediationListDTO
 */

public class MediationListDTO {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("next")
  private String next = null;

  @SerializedName("previous")
  private String previous = null;

  @SerializedName("list")
  private List<MediationInfoDTO> list = null;

  public MediationListDTO count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of mediation sequences returned. 
   * @return count
  **/
  @ApiModelProperty(example = "1", value = "Number of mediation sequences returned. ")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public MediationListDTO next(String next) {
    this.next = next;
    return this;
  }

   /**
   * Link to the next subset of sequences qualified. Empty if no more sequences are to be returned. 
   * @return next
  **/
  @ApiModelProperty(example = "", value = "Link to the next subset of sequences qualified. Empty if no more sequences are to be returned. ")
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public MediationListDTO previous(String previous) {
    this.previous = previous;
    return this;
  }

   /**
   * Link to the previous subset of sequences qualified. Empty if current subset is the first subset returned. 
   * @return previous
  **/
  @ApiModelProperty(example = "", value = "Link to the previous subset of sequences qualified. Empty if current subset is the first subset returned. ")
  public String getPrevious() {
    return previous;
  }

  public void setPrevious(String previous) {
    this.previous = previous;
  }

  public MediationListDTO list(List<MediationInfoDTO> list) {
    this.list = list;
    return this;
  }

  public MediationListDTO addListItem(MediationInfoDTO listItem) {
    if (this.list == null) {
      this.list = new ArrayList<>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @ApiModelProperty(value = "")
  public List<MediationInfoDTO> getList() {
    return list;
  }

  public void setList(List<MediationInfoDTO> list) {
    this.list = list;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediationListDTO mediationList = (MediationListDTO) o;
    return Objects.equals(this.count, mediationList.count) &&
        Objects.equals(this.next, mediationList.next) &&
        Objects.equals(this.previous, mediationList.previous) &&
        Objects.equals(this.list, mediationList.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, list);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediationListDTO {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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

