/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.3.7
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.accounting;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * The raw AccountsReceivable(sales invoices) and AccountsPayable(bills) outstanding and overdue
 * amounts, not converted to base currency (read only)
 */
@ApiModel(
    description =
        "The raw AccountsReceivable(sales invoices) and AccountsPayable(bills) outstanding and"
            + " overdue amounts, not converted to base currency (read only)")
public class Balances {
  StringUtil util = new StringUtil();

  @JsonProperty("AccountsReceivable")
  private AccountsReceivable accountsReceivable;

  @JsonProperty("AccountsPayable")
  private AccountsPayable accountsPayable;

  public Balances accountsReceivable(AccountsReceivable accountsReceivable) {
    this.accountsReceivable = accountsReceivable;
    return this;
  }

  /**
   * Get accountsReceivable
   *
   * @return accountsReceivable
   */
  @ApiModelProperty(value = "")
  public AccountsReceivable getAccountsReceivable() {
    return accountsReceivable;
  }

  public void setAccountsReceivable(AccountsReceivable accountsReceivable) {
    this.accountsReceivable = accountsReceivable;
  }

  public Balances accountsPayable(AccountsPayable accountsPayable) {
    this.accountsPayable = accountsPayable;
    return this;
  }

  /**
   * Get accountsPayable
   *
   * @return accountsPayable
   */
  @ApiModelProperty(value = "")
  public AccountsPayable getAccountsPayable() {
    return accountsPayable;
  }

  public void setAccountsPayable(AccountsPayable accountsPayable) {
    this.accountsPayable = accountsPayable;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Balances balances = (Balances) o;
    return Objects.equals(this.accountsReceivable, balances.accountsReceivable)
        && Objects.equals(this.accountsPayable, balances.accountsPayable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountsReceivable, accountsPayable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Balances {\n");
    sb.append("    accountsReceivable: ").append(toIndentedString(accountsReceivable)).append("\n");
    sb.append("    accountsPayable: ").append(toIndentedString(accountsPayable)).append("\n");
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
