/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.accounting;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.accounting.Organisation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Organisations
 */

public class Organisations {
  
  @JsonProperty("Organisations")
  private List<Organisation> organisations = null;

  public Organisations organisations(List<Organisation> organisations) {
    this.organisations = organisations;
    return this;
  }

  public Organisations addOrganisationsItem(Organisation organisationsItem) {
    if (this.organisations == null) {
      this.organisations = new ArrayList<Organisation>();
    }
    this.organisations.add(organisationsItem);
    return this;
  }

   /**
   * Get organisations
   * @return organisations
  **/
  @ApiModelProperty(value = "")
  public List<Organisation> getOrganisations() {
    return organisations;
  }

  public void setOrganisations(List<Organisation> organisations) {
    this.organisations = organisations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organisations organisations = (Organisations) o;
    return Objects.equals(this.organisations, organisations.organisations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organisations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organisations {\n");
    
    sb.append("    organisations: ").append(toIndentedString(organisations)).append("\n");
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

