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
import com.xero.models.accounting.ManualJournal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * ManualJournals
 */

public class ManualJournals {
  
  @JsonProperty("ManualJournals")
  private List<ManualJournal> manualJournals = null;

  public ManualJournals manualJournals(List<ManualJournal> manualJournals) {
    this.manualJournals = manualJournals;
    return this;
  }

  public ManualJournals addManualJournalsItem(ManualJournal manualJournalsItem) {
    if (this.manualJournals == null) {
      this.manualJournals = new ArrayList<ManualJournal>();
    }
    this.manualJournals.add(manualJournalsItem);
    return this;
  }

   /**
   * Get manualJournals
   * @return manualJournals
  **/
  @ApiModelProperty(value = "")
  public List<ManualJournal> getManualJournals() {
    return manualJournals;
  }

  public void setManualJournals(List<ManualJournal> manualJournals) {
    this.manualJournals = manualJournals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManualJournals manualJournals = (ManualJournals) o;
    return Objects.equals(this.manualJournals, manualJournals.manualJournals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manualJournals);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManualJournals {\n");
    
    sb.append("    manualJournals: ").append(toIndentedString(manualJournals)).append("\n");
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

