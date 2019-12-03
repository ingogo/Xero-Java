/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.payrollau;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.payrollau.EarningsType;
import com.xero.models.payrollau.EmploymentTerminationPaymentType;
import com.xero.models.payrollau.RateType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * EarningsRate
 */

public class EarningsRate {
  
  @JsonProperty("Name")
  private String name;

  
  @JsonProperty("AccountCode")
  private String accountCode;

  
  @JsonProperty("TypeOfUnits")
  private String typeOfUnits;

  
  @JsonProperty("IsExemptFromTax")
  private Boolean isExemptFromTax;

  
  @JsonProperty("IsExemptFromSuper")
  private Boolean isExemptFromSuper;

  
  @JsonProperty("IsReportableAsW1")
  private Boolean isReportableAsW1;

  
  @JsonProperty("EarningsType")
  private EarningsType earningsType;

  
  @JsonProperty("EarningsRateID")
  private UUID earningsRateID;

  
  @JsonProperty("RateType")
  private RateType rateType;

  
  @JsonProperty("RatePerUnit")
  private String ratePerUnit;

  
  @JsonProperty("Multiplier")
  private Float multiplier;

  
  @JsonProperty("AccrueLeave")
  private Float accrueLeave;

  
  @JsonProperty("Amount")
  private Float amount;

  
  @JsonProperty("EmploymentTerminationPaymentType")
  private EmploymentTerminationPaymentType employmentTerminationPaymentType;

  
  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;

  public EarningsRate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the earnings rate (max length &#x3D; 100)
   * @return name
  **/
  @ApiModelProperty(example = "PTO", value = "Name of the earnings rate (max length = 100)")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EarningsRate accountCode(String accountCode) {
    this.accountCode = accountCode;
    return this;
  }

   /**
   * See Accounts
   * @return accountCode
  **/
  @ApiModelProperty(example = "720", value = "See Accounts")
  public String getAccountCode() {
    return accountCode;
  }

  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
  }

  public EarningsRate typeOfUnits(String typeOfUnits) {
    this.typeOfUnits = typeOfUnits;
    return this;
  }

   /**
   * Type of units used to record earnings (max length &#x3D; 50). Only When RateType is RATEPERUNIT
   * @return typeOfUnits
  **/
  @ApiModelProperty(example = "Fixed", value = "Type of units used to record earnings (max length = 50). Only When RateType is RATEPERUNIT")
  public String getTypeOfUnits() {
    return typeOfUnits;
  }

  public void setTypeOfUnits(String typeOfUnits) {
    this.typeOfUnits = typeOfUnits;
  }

  public EarningsRate isExemptFromTax(Boolean isExemptFromTax) {
    this.isExemptFromTax = isExemptFromTax;
    return this;
  }

   /**
   * Most payments are subject to tax, so you should only set this value if you are sure that a payment is exempt from PAYG withholding
   * @return isExemptFromTax
  **/
  @ApiModelProperty(example = "false", value = "Most payments are subject to tax, so you should only set this value if you are sure that a payment is exempt from PAYG withholding")
  public Boolean getIsExemptFromTax() {
    return isExemptFromTax;
  }

  public void setIsExemptFromTax(Boolean isExemptFromTax) {
    this.isExemptFromTax = isExemptFromTax;
  }

  public EarningsRate isExemptFromSuper(Boolean isExemptFromSuper) {
    this.isExemptFromSuper = isExemptFromSuper;
    return this;
  }

   /**
   * See the ATO website for details of which payments are exempt from SGC
   * @return isExemptFromSuper
  **/
  @ApiModelProperty(example = "false", value = "See the ATO website for details of which payments are exempt from SGC")
  public Boolean getIsExemptFromSuper() {
    return isExemptFromSuper;
  }

  public void setIsExemptFromSuper(Boolean isExemptFromSuper) {
    this.isExemptFromSuper = isExemptFromSuper;
  }

  public EarningsRate isReportableAsW1(Boolean isReportableAsW1) {
    this.isReportableAsW1 = isReportableAsW1;
    return this;
  }

   /**
   * Boolean to determine if the earnings rate is reportable or exempt from W1
   * @return isReportableAsW1
  **/
  @ApiModelProperty(example = "false", value = "Boolean to determine if the earnings rate is reportable or exempt from W1")
  public Boolean getIsReportableAsW1() {
    return isReportableAsW1;
  }

  public void setIsReportableAsW1(Boolean isReportableAsW1) {
    this.isReportableAsW1 = isReportableAsW1;
  }

  public EarningsRate earningsType(EarningsType earningsType) {
    this.earningsType = earningsType;
    return this;
  }

   /**
   * Get earningsType
   * @return earningsType
  **/
  @ApiModelProperty(value = "")
  public EarningsType getEarningsType() {
    return earningsType;
  }

  public void setEarningsType(EarningsType earningsType) {
    this.earningsType = earningsType;
  }

  public EarningsRate earningsRateID(UUID earningsRateID) {
    this.earningsRateID = earningsRateID;
    return this;
  }

   /**
   * Xero identifier
   * @return earningsRateID
  **/
  @ApiModelProperty(example = "e0eb6747-7c17-4075-b804-989f8d4e5d39", value = "Xero identifier")
  public UUID getEarningsRateID() {
    return earningsRateID;
  }

  public void setEarningsRateID(UUID earningsRateID) {
    this.earningsRateID = earningsRateID;
  }

  public EarningsRate rateType(RateType rateType) {
    this.rateType = rateType;
    return this;
  }

   /**
   * Get rateType
   * @return rateType
  **/
  @ApiModelProperty(value = "")
  public RateType getRateType() {
    return rateType;
  }

  public void setRateType(RateType rateType) {
    this.rateType = rateType;
  }

  public EarningsRate ratePerUnit(String ratePerUnit) {
    this.ratePerUnit = ratePerUnit;
    return this;
  }

   /**
   * Default rate per unit (optional). Only applicable if RateType is RATEPERUNIT.
   * @return ratePerUnit
  **/
  @ApiModelProperty(example = "10", value = "Default rate per unit (optional). Only applicable if RateType is RATEPERUNIT.")
  public String getRatePerUnit() {
    return ratePerUnit;
  }

  public void setRatePerUnit(String ratePerUnit) {
    this.ratePerUnit = ratePerUnit;
  }

  public EarningsRate multiplier(Float multiplier) {
    this.multiplier = multiplier;
    return this;
  }

   /**
   * This is the multiplier used to calculate the rate per unit, based on the employee’s ordinary earnings rate. For example, for time and a half enter 1.5. Only applicable if RateType is MULTIPLE
   * @return multiplier
  **/
  @ApiModelProperty(example = "1.5", value = "This is the multiplier used to calculate the rate per unit, based on the employee’s ordinary earnings rate. For example, for time and a half enter 1.5. Only applicable if RateType is MULTIPLE")
  public Float getMultiplier() {
    return multiplier;
  }

  public void setMultiplier(Float multiplier) {
    this.multiplier = multiplier;
  }

  public EarningsRate accrueLeave(Float accrueLeave) {
    this.accrueLeave = accrueLeave;
    return this;
  }

   /**
   * Indicates that this earnings rate should accrue leave. Only applicable if RateType is MULTIPLE
   * @return accrueLeave
  **/
  @ApiModelProperty(example = "1.5", value = "Indicates that this earnings rate should accrue leave. Only applicable if RateType is MULTIPLE")
  public Float getAccrueLeave() {
    return accrueLeave;
  }

  public void setAccrueLeave(Float accrueLeave) {
    this.accrueLeave = accrueLeave;
  }

  public EarningsRate amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Optional Amount for FIXEDAMOUNT RateType EarningsRate
   * @return amount
  **/
  @ApiModelProperty(example = "50.3", value = "Optional Amount for FIXEDAMOUNT RateType EarningsRate")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public EarningsRate employmentTerminationPaymentType(EmploymentTerminationPaymentType employmentTerminationPaymentType) {
    this.employmentTerminationPaymentType = employmentTerminationPaymentType;
    return this;
  }

   /**
   * Get employmentTerminationPaymentType
   * @return employmentTerminationPaymentType
  **/
  @ApiModelProperty(value = "")
  public EmploymentTerminationPaymentType getEmploymentTerminationPaymentType() {
    return employmentTerminationPaymentType;
  }

  public void setEmploymentTerminationPaymentType(EmploymentTerminationPaymentType employmentTerminationPaymentType) {
    this.employmentTerminationPaymentType = employmentTerminationPaymentType;
  }

  public EarningsRate updatedDateUTC(String updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
    return this;
  }

   /**
   * Last modified timestamp
   * @return updatedDateUTC
  **/
  @ApiModelProperty(example = "2018-04-01T23:02:36", value = "Last modified timestamp")
  public String getUpdatedDateUTC() {
    return updatedDateUTC;
  }

  public void setUpdatedDateUTC(String updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EarningsRate earningsRate = (EarningsRate) o;
    return Objects.equals(this.name, earningsRate.name) &&
        Objects.equals(this.accountCode, earningsRate.accountCode) &&
        Objects.equals(this.typeOfUnits, earningsRate.typeOfUnits) &&
        Objects.equals(this.isExemptFromTax, earningsRate.isExemptFromTax) &&
        Objects.equals(this.isExemptFromSuper, earningsRate.isExemptFromSuper) &&
        Objects.equals(this.isReportableAsW1, earningsRate.isReportableAsW1) &&
        Objects.equals(this.earningsType, earningsRate.earningsType) &&
        Objects.equals(this.earningsRateID, earningsRate.earningsRateID) &&
        Objects.equals(this.rateType, earningsRate.rateType) &&
        Objects.equals(this.ratePerUnit, earningsRate.ratePerUnit) &&
        Objects.equals(this.multiplier, earningsRate.multiplier) &&
        Objects.equals(this.accrueLeave, earningsRate.accrueLeave) &&
        Objects.equals(this.amount, earningsRate.amount) &&
        Objects.equals(this.employmentTerminationPaymentType, earningsRate.employmentTerminationPaymentType) &&
        Objects.equals(this.updatedDateUTC, earningsRate.updatedDateUTC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, accountCode, typeOfUnits, isExemptFromTax, isExemptFromSuper, isReportableAsW1, earningsType, earningsRateID, rateType, ratePerUnit, multiplier, accrueLeave, amount, employmentTerminationPaymentType, updatedDateUTC);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarningsRate {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    typeOfUnits: ").append(toIndentedString(typeOfUnits)).append("\n");
    sb.append("    isExemptFromTax: ").append(toIndentedString(isExemptFromTax)).append("\n");
    sb.append("    isExemptFromSuper: ").append(toIndentedString(isExemptFromSuper)).append("\n");
    sb.append("    isReportableAsW1: ").append(toIndentedString(isReportableAsW1)).append("\n");
    sb.append("    earningsType: ").append(toIndentedString(earningsType)).append("\n");
    sb.append("    earningsRateID: ").append(toIndentedString(earningsRateID)).append("\n");
    sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
    sb.append("    ratePerUnit: ").append(toIndentedString(ratePerUnit)).append("\n");
    sb.append("    multiplier: ").append(toIndentedString(multiplier)).append("\n");
    sb.append("    accrueLeave: ").append(toIndentedString(accrueLeave)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    employmentTerminationPaymentType: ").append(toIndentedString(employmentTerminationPaymentType)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
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
