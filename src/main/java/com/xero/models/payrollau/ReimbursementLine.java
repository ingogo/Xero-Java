/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 2.3.7
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollau;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;

/** ReimbursementLine */
public class ReimbursementLine {
  StringUtil util = new StringUtil();

  @JsonProperty("ReimbursementTypeID")
  private UUID reimbursementTypeID;

  @JsonProperty("Amount")
  private Double amount;

  @JsonProperty("Description")
  private String description;

  @JsonProperty("ExpenseAccount")
  private String expenseAccount;

  public ReimbursementLine reimbursementTypeID(UUID reimbursementTypeID) {
    this.reimbursementTypeID = reimbursementTypeID;
    return this;
  }

  /**
   * Xero reimbursement type identifier
   *
   * @return reimbursementTypeID
   */
  @ApiModelProperty(
      example = "bd246b96-c637-4767-81cf-851ba8fa93c2",
      value = "Xero reimbursement type identifier")
  public UUID getReimbursementTypeID() {
    return reimbursementTypeID;
  }

  public void setReimbursementTypeID(UUID reimbursementTypeID) {
    this.reimbursementTypeID = reimbursementTypeID;
  }

  public ReimbursementLine amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Reimbursement type amount
   *
   * @return amount
   */
  @ApiModelProperty(example = "10.0", value = "Reimbursement type amount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public ReimbursementLine description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Reimbursement lines description (max length 50)
   *
   * @return description
   */
  @ApiModelProperty(
      example = "For the taxi",
      value = "Reimbursement lines description (max length 50)")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ReimbursementLine expenseAccount(String expenseAccount) {
    this.expenseAccount = expenseAccount;
    return this;
  }

  /**
   * Reimbursement expense account. For posted pay run you should be able to see expense account
   * code.
   *
   * @return expenseAccount
   */
  @ApiModelProperty(
      example = "420",
      value =
          "Reimbursement expense account. For posted pay run you should be able to see expense"
              + " account code.")
  public String getExpenseAccount() {
    return expenseAccount;
  }

  public void setExpenseAccount(String expenseAccount) {
    this.expenseAccount = expenseAccount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReimbursementLine reimbursementLine = (ReimbursementLine) o;
    return Objects.equals(this.reimbursementTypeID, reimbursementLine.reimbursementTypeID)
        && Objects.equals(this.amount, reimbursementLine.amount)
        && Objects.equals(this.description, reimbursementLine.description)
        && Objects.equals(this.expenseAccount, reimbursementLine.expenseAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reimbursementTypeID, amount, description, expenseAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReimbursementLine {\n");
    sb.append("    reimbursementTypeID: ")
        .append(toIndentedString(reimbursementTypeID))
        .append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expenseAccount: ").append(toIndentedString(expenseAccount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
