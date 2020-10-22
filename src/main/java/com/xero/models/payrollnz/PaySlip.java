/*
 * Xero Payroll NZ
 * This is the Xero Payroll API for orgs in the NZ region.
 *
 * The version of the OpenAPI document: 2.3.7
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollnz;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.LocalDateTime;

/** PaySlip */
public class PaySlip {
  StringUtil util = new StringUtil();

  @JsonProperty("paySlipID")
  private UUID paySlipID;

  @JsonProperty("employeeID")
  private UUID employeeID;

  @JsonProperty("payRunID")
  private UUID payRunID;

  @JsonProperty("lastEdited")
  private LocalDateTime lastEdited;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("totalEarnings")
  private Double totalEarnings;

  @JsonProperty("grossEarnings")
  private Double grossEarnings;

  @JsonProperty("totalPay")
  private Double totalPay;

  @JsonProperty("totalEmployerTaxes")
  private Double totalEmployerTaxes;

  @JsonProperty("totalEmployeeTaxes")
  private Double totalEmployeeTaxes;

  @JsonProperty("totalDeductions")
  private Double totalDeductions;

  @JsonProperty("totalReimbursements")
  private Double totalReimbursements;

  @JsonProperty("totalStatutoryDeductions")
  private Double totalStatutoryDeductions;

  @JsonProperty("totalSuperannuation")
  private Double totalSuperannuation;

  @JsonProperty("bacsHash")
  private String bacsHash;
  /** The payment method code */
  public enum PaymentMethodEnum {
    CHEQUE("Cheque"),

    ELECTRONICALLY("Electronically"),

    MANUAL("Manual");

    private String value;

    PaymentMethodEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PaymentMethodEnum fromValue(String value) {
      for (PaymentMethodEnum b : PaymentMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("paymentMethod")
  private PaymentMethodEnum paymentMethod;

  @JsonProperty("earningsLines")
  private List<EarningsLine> earningsLines = new ArrayList<EarningsLine>();

  @JsonProperty("leaveEarningsLines")
  private List<LeaveEarningsLine> leaveEarningsLines = new ArrayList<LeaveEarningsLine>();

  @JsonProperty("timesheetEarningsLines")
  private List<TimesheetEarningsLine> timesheetEarningsLines =
      new ArrayList<TimesheetEarningsLine>();

  @JsonProperty("deductionLines")
  private List<DeductionLine> deductionLines = new ArrayList<DeductionLine>();

  @JsonProperty("reimbursementLines")
  private List<ReimbursementLine> reimbursementLines = new ArrayList<ReimbursementLine>();

  @JsonProperty("leaveAccrualLines")
  private List<LeaveAccrualLine> leaveAccrualLines = new ArrayList<LeaveAccrualLine>();

  @JsonProperty("superannuationLines")
  private List<SuperannuationLine> superannuationLines = new ArrayList<SuperannuationLine>();

  @JsonProperty("paymentLines")
  private List<PaymentLine> paymentLines = new ArrayList<PaymentLine>();

  @JsonProperty("employeeTaxLines")
  private List<TaxLine> employeeTaxLines = new ArrayList<TaxLine>();

  @JsonProperty("employerTaxLines")
  private List<TaxLine> employerTaxLines = new ArrayList<TaxLine>();

  @JsonProperty("statutoryDeductionLines")
  private List<StatutoryDeductionLine> statutoryDeductionLines =
      new ArrayList<StatutoryDeductionLine>();

  @JsonProperty("taxSettings")
  private TaxSettings taxSettings;

  @JsonProperty("grossEarningsHistory")
  private GrossEarningsHistory grossEarningsHistory;

  public PaySlip paySlipID(UUID paySlipID) {
    this.paySlipID = paySlipID;
    return this;
  }

  /**
   * The Xero identifier for a PaySlip
   *
   * @return paySlipID
   */
  @ApiModelProperty(value = "The Xero identifier for a PaySlip")
  public UUID getPaySlipID() {
    return paySlipID;
  }

  public void setPaySlipID(UUID paySlipID) {
    this.paySlipID = paySlipID;
  }

  public PaySlip employeeID(UUID employeeID) {
    this.employeeID = employeeID;
    return this;
  }

  /**
   * The Xero identifier for payroll employee
   *
   * @return employeeID
   */
  @ApiModelProperty(value = "The Xero identifier for payroll employee")
  public UUID getEmployeeID() {
    return employeeID;
  }

  public void setEmployeeID(UUID employeeID) {
    this.employeeID = employeeID;
  }

  public PaySlip payRunID(UUID payRunID) {
    this.payRunID = payRunID;
    return this;
  }

  /**
   * The Xero identifier for the associated payrun
   *
   * @return payRunID
   */
  @ApiModelProperty(value = "The Xero identifier for the associated payrun")
  public UUID getPayRunID() {
    return payRunID;
  }

  public void setPayRunID(UUID payRunID) {
    this.payRunID = payRunID;
  }

  public PaySlip lastEdited(LocalDateTime lastEdited) {
    this.lastEdited = lastEdited;
    return this;
  }

  /**
   * The date payslip was last updated
   *
   * @return lastEdited
   */
  @ApiModelProperty(value = "The date payslip was last updated")
  public LocalDateTime getLastEdited() {
    return lastEdited;
  }

  public void setLastEdited(LocalDateTime lastEdited) {
    this.lastEdited = lastEdited;
  }

  public PaySlip firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Employee first name
   *
   * @return firstName
   */
  @ApiModelProperty(value = "Employee first name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PaySlip lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Employee last name
   *
   * @return lastName
   */
  @ApiModelProperty(value = "Employee last name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public PaySlip totalEarnings(Double totalEarnings) {
    this.totalEarnings = totalEarnings;
    return this;
  }

  /**
   * Total earnings before any deductions. Same as gross earnings for NZ.
   *
   * @return totalEarnings
   */
  @ApiModelProperty(value = "Total earnings before any deductions. Same as gross earnings for NZ.")
  public Double getTotalEarnings() {
    return totalEarnings;
  }

  public void setTotalEarnings(Double totalEarnings) {
    this.totalEarnings = totalEarnings;
  }

  public PaySlip grossEarnings(Double grossEarnings) {
    this.grossEarnings = grossEarnings;
    return this;
  }

  /**
   * Total earnings before any deductions. Same as total earnings for NZ.
   *
   * @return grossEarnings
   */
  @ApiModelProperty(value = "Total earnings before any deductions. Same as total earnings for NZ.")
  public Double getGrossEarnings() {
    return grossEarnings;
  }

  public void setGrossEarnings(Double grossEarnings) {
    this.grossEarnings = grossEarnings;
  }

  public PaySlip totalPay(Double totalPay) {
    this.totalPay = totalPay;
    return this;
  }

  /**
   * The employee net pay
   *
   * @return totalPay
   */
  @ApiModelProperty(value = "The employee net pay")
  public Double getTotalPay() {
    return totalPay;
  }

  public void setTotalPay(Double totalPay) {
    this.totalPay = totalPay;
  }

  public PaySlip totalEmployerTaxes(Double totalEmployerTaxes) {
    this.totalEmployerTaxes = totalEmployerTaxes;
    return this;
  }

  /**
   * The employer&#39;s tax obligation
   *
   * @return totalEmployerTaxes
   */
  @ApiModelProperty(value = "The employer's tax obligation")
  public Double getTotalEmployerTaxes() {
    return totalEmployerTaxes;
  }

  public void setTotalEmployerTaxes(Double totalEmployerTaxes) {
    this.totalEmployerTaxes = totalEmployerTaxes;
  }

  public PaySlip totalEmployeeTaxes(Double totalEmployeeTaxes) {
    this.totalEmployeeTaxes = totalEmployeeTaxes;
    return this;
  }

  /**
   * The part of an employee&#39;s earnings that is deducted for tax purposes
   *
   * @return totalEmployeeTaxes
   */
  @ApiModelProperty(value = "The part of an employee's earnings that is deducted for tax purposes")
  public Double getTotalEmployeeTaxes() {
    return totalEmployeeTaxes;
  }

  public void setTotalEmployeeTaxes(Double totalEmployeeTaxes) {
    this.totalEmployeeTaxes = totalEmployeeTaxes;
  }

  public PaySlip totalDeductions(Double totalDeductions) {
    this.totalDeductions = totalDeductions;
    return this;
  }

  /**
   * Total amount subtracted from an employee&#39;s earnings to reach total pay
   *
   * @return totalDeductions
   */
  @ApiModelProperty(
      value = "Total amount subtracted from an employee's earnings to reach total pay")
  public Double getTotalDeductions() {
    return totalDeductions;
  }

  public void setTotalDeductions(Double totalDeductions) {
    this.totalDeductions = totalDeductions;
  }

  public PaySlip totalReimbursements(Double totalReimbursements) {
    this.totalReimbursements = totalReimbursements;
    return this;
  }

  /**
   * Total reimbursements are nontaxable payments to an employee used to repay out-of-pocket
   * expenses when the person incurs those expenses through employment
   *
   * @return totalReimbursements
   */
  @ApiModelProperty(
      value =
          "Total reimbursements are nontaxable payments to an employee used to repay out-of-pocket"
              + " expenses when the person incurs those expenses through employment")
  public Double getTotalReimbursements() {
    return totalReimbursements;
  }

  public void setTotalReimbursements(Double totalReimbursements) {
    this.totalReimbursements = totalReimbursements;
  }

  public PaySlip totalStatutoryDeductions(Double totalStatutoryDeductions) {
    this.totalStatutoryDeductions = totalStatutoryDeductions;
    return this;
  }

  /**
   * Total amounts required by law to subtract from the employee&#39;s earnings
   *
   * @return totalStatutoryDeductions
   */
  @ApiModelProperty(
      value = "Total amounts required by law to subtract from the employee's earnings")
  public Double getTotalStatutoryDeductions() {
    return totalStatutoryDeductions;
  }

  public void setTotalStatutoryDeductions(Double totalStatutoryDeductions) {
    this.totalStatutoryDeductions = totalStatutoryDeductions;
  }

  public PaySlip totalSuperannuation(Double totalSuperannuation) {
    this.totalSuperannuation = totalSuperannuation;
    return this;
  }

  /**
   * Benefits (also called fringe benefits, perquisites or perks) are various non-earnings
   * compensations provided to employees in addition to their normal earnings or salaries
   *
   * @return totalSuperannuation
   */
  @ApiModelProperty(
      value =
          "Benefits (also called fringe benefits, perquisites or perks) are various non-earnings"
              + " compensations provided to employees in addition to their normal earnings or"
              + " salaries")
  public Double getTotalSuperannuation() {
    return totalSuperannuation;
  }

  public void setTotalSuperannuation(Double totalSuperannuation) {
    this.totalSuperannuation = totalSuperannuation;
  }

  public PaySlip bacsHash(String bacsHash) {
    this.bacsHash = bacsHash;
    return this;
  }

  /**
   * BACS Service User Number
   *
   * @return bacsHash
   */
  @ApiModelProperty(value = "BACS Service User Number")
  public String getBacsHash() {
    return bacsHash;
  }

  public void setBacsHash(String bacsHash) {
    this.bacsHash = bacsHash;
  }

  public PaySlip paymentMethod(PaymentMethodEnum paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * The payment method code
   *
   * @return paymentMethod
   */
  @ApiModelProperty(value = "The payment method code")
  public PaymentMethodEnum getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethodEnum paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public PaySlip earningsLines(List<EarningsLine> earningsLines) {
    this.earningsLines = earningsLines;
    return this;
  }

  public PaySlip addEarningsLinesItem(EarningsLine earningsLinesItem) {
    if (this.earningsLines == null) {
      this.earningsLines = new ArrayList<EarningsLine>();
    }
    this.earningsLines.add(earningsLinesItem);
    return this;
  }

  /**
   * Get earningsLines
   *
   * @return earningsLines
   */
  @ApiModelProperty(value = "")
  public List<EarningsLine> getEarningsLines() {
    return earningsLines;
  }

  public void setEarningsLines(List<EarningsLine> earningsLines) {
    this.earningsLines = earningsLines;
  }

  public PaySlip leaveEarningsLines(List<LeaveEarningsLine> leaveEarningsLines) {
    this.leaveEarningsLines = leaveEarningsLines;
    return this;
  }

  public PaySlip addLeaveEarningsLinesItem(LeaveEarningsLine leaveEarningsLinesItem) {
    if (this.leaveEarningsLines == null) {
      this.leaveEarningsLines = new ArrayList<LeaveEarningsLine>();
    }
    this.leaveEarningsLines.add(leaveEarningsLinesItem);
    return this;
  }

  /**
   * Get leaveEarningsLines
   *
   * @return leaveEarningsLines
   */
  @ApiModelProperty(value = "")
  public List<LeaveEarningsLine> getLeaveEarningsLines() {
    return leaveEarningsLines;
  }

  public void setLeaveEarningsLines(List<LeaveEarningsLine> leaveEarningsLines) {
    this.leaveEarningsLines = leaveEarningsLines;
  }

  public PaySlip timesheetEarningsLines(List<TimesheetEarningsLine> timesheetEarningsLines) {
    this.timesheetEarningsLines = timesheetEarningsLines;
    return this;
  }

  public PaySlip addTimesheetEarningsLinesItem(TimesheetEarningsLine timesheetEarningsLinesItem) {
    if (this.timesheetEarningsLines == null) {
      this.timesheetEarningsLines = new ArrayList<TimesheetEarningsLine>();
    }
    this.timesheetEarningsLines.add(timesheetEarningsLinesItem);
    return this;
  }

  /**
   * Get timesheetEarningsLines
   *
   * @return timesheetEarningsLines
   */
  @ApiModelProperty(value = "")
  public List<TimesheetEarningsLine> getTimesheetEarningsLines() {
    return timesheetEarningsLines;
  }

  public void setTimesheetEarningsLines(List<TimesheetEarningsLine> timesheetEarningsLines) {
    this.timesheetEarningsLines = timesheetEarningsLines;
  }

  public PaySlip deductionLines(List<DeductionLine> deductionLines) {
    this.deductionLines = deductionLines;
    return this;
  }

  public PaySlip addDeductionLinesItem(DeductionLine deductionLinesItem) {
    if (this.deductionLines == null) {
      this.deductionLines = new ArrayList<DeductionLine>();
    }
    this.deductionLines.add(deductionLinesItem);
    return this;
  }

  /**
   * Get deductionLines
   *
   * @return deductionLines
   */
  @ApiModelProperty(value = "")
  public List<DeductionLine> getDeductionLines() {
    return deductionLines;
  }

  public void setDeductionLines(List<DeductionLine> deductionLines) {
    this.deductionLines = deductionLines;
  }

  public PaySlip reimbursementLines(List<ReimbursementLine> reimbursementLines) {
    this.reimbursementLines = reimbursementLines;
    return this;
  }

  public PaySlip addReimbursementLinesItem(ReimbursementLine reimbursementLinesItem) {
    if (this.reimbursementLines == null) {
      this.reimbursementLines = new ArrayList<ReimbursementLine>();
    }
    this.reimbursementLines.add(reimbursementLinesItem);
    return this;
  }

  /**
   * Get reimbursementLines
   *
   * @return reimbursementLines
   */
  @ApiModelProperty(value = "")
  public List<ReimbursementLine> getReimbursementLines() {
    return reimbursementLines;
  }

  public void setReimbursementLines(List<ReimbursementLine> reimbursementLines) {
    this.reimbursementLines = reimbursementLines;
  }

  public PaySlip leaveAccrualLines(List<LeaveAccrualLine> leaveAccrualLines) {
    this.leaveAccrualLines = leaveAccrualLines;
    return this;
  }

  public PaySlip addLeaveAccrualLinesItem(LeaveAccrualLine leaveAccrualLinesItem) {
    if (this.leaveAccrualLines == null) {
      this.leaveAccrualLines = new ArrayList<LeaveAccrualLine>();
    }
    this.leaveAccrualLines.add(leaveAccrualLinesItem);
    return this;
  }

  /**
   * Get leaveAccrualLines
   *
   * @return leaveAccrualLines
   */
  @ApiModelProperty(value = "")
  public List<LeaveAccrualLine> getLeaveAccrualLines() {
    return leaveAccrualLines;
  }

  public void setLeaveAccrualLines(List<LeaveAccrualLine> leaveAccrualLines) {
    this.leaveAccrualLines = leaveAccrualLines;
  }

  public PaySlip superannuationLines(List<SuperannuationLine> superannuationLines) {
    this.superannuationLines = superannuationLines;
    return this;
  }

  public PaySlip addSuperannuationLinesItem(SuperannuationLine superannuationLinesItem) {
    if (this.superannuationLines == null) {
      this.superannuationLines = new ArrayList<SuperannuationLine>();
    }
    this.superannuationLines.add(superannuationLinesItem);
    return this;
  }

  /**
   * Get superannuationLines
   *
   * @return superannuationLines
   */
  @ApiModelProperty(value = "")
  public List<SuperannuationLine> getSuperannuationLines() {
    return superannuationLines;
  }

  public void setSuperannuationLines(List<SuperannuationLine> superannuationLines) {
    this.superannuationLines = superannuationLines;
  }

  public PaySlip paymentLines(List<PaymentLine> paymentLines) {
    this.paymentLines = paymentLines;
    return this;
  }

  public PaySlip addPaymentLinesItem(PaymentLine paymentLinesItem) {
    if (this.paymentLines == null) {
      this.paymentLines = new ArrayList<PaymentLine>();
    }
    this.paymentLines.add(paymentLinesItem);
    return this;
  }

  /**
   * Get paymentLines
   *
   * @return paymentLines
   */
  @ApiModelProperty(value = "")
  public List<PaymentLine> getPaymentLines() {
    return paymentLines;
  }

  public void setPaymentLines(List<PaymentLine> paymentLines) {
    this.paymentLines = paymentLines;
  }

  public PaySlip employeeTaxLines(List<TaxLine> employeeTaxLines) {
    this.employeeTaxLines = employeeTaxLines;
    return this;
  }

  public PaySlip addEmployeeTaxLinesItem(TaxLine employeeTaxLinesItem) {
    if (this.employeeTaxLines == null) {
      this.employeeTaxLines = new ArrayList<TaxLine>();
    }
    this.employeeTaxLines.add(employeeTaxLinesItem);
    return this;
  }

  /**
   * Get employeeTaxLines
   *
   * @return employeeTaxLines
   */
  @ApiModelProperty(value = "")
  public List<TaxLine> getEmployeeTaxLines() {
    return employeeTaxLines;
  }

  public void setEmployeeTaxLines(List<TaxLine> employeeTaxLines) {
    this.employeeTaxLines = employeeTaxLines;
  }

  public PaySlip employerTaxLines(List<TaxLine> employerTaxLines) {
    this.employerTaxLines = employerTaxLines;
    return this;
  }

  public PaySlip addEmployerTaxLinesItem(TaxLine employerTaxLinesItem) {
    if (this.employerTaxLines == null) {
      this.employerTaxLines = new ArrayList<TaxLine>();
    }
    this.employerTaxLines.add(employerTaxLinesItem);
    return this;
  }

  /**
   * Get employerTaxLines
   *
   * @return employerTaxLines
   */
  @ApiModelProperty(value = "")
  public List<TaxLine> getEmployerTaxLines() {
    return employerTaxLines;
  }

  public void setEmployerTaxLines(List<TaxLine> employerTaxLines) {
    this.employerTaxLines = employerTaxLines;
  }

  public PaySlip statutoryDeductionLines(List<StatutoryDeductionLine> statutoryDeductionLines) {
    this.statutoryDeductionLines = statutoryDeductionLines;
    return this;
  }

  public PaySlip addStatutoryDeductionLinesItem(
      StatutoryDeductionLine statutoryDeductionLinesItem) {
    if (this.statutoryDeductionLines == null) {
      this.statutoryDeductionLines = new ArrayList<StatutoryDeductionLine>();
    }
    this.statutoryDeductionLines.add(statutoryDeductionLinesItem);
    return this;
  }

  /**
   * Get statutoryDeductionLines
   *
   * @return statutoryDeductionLines
   */
  @ApiModelProperty(value = "")
  public List<StatutoryDeductionLine> getStatutoryDeductionLines() {
    return statutoryDeductionLines;
  }

  public void setStatutoryDeductionLines(List<StatutoryDeductionLine> statutoryDeductionLines) {
    this.statutoryDeductionLines = statutoryDeductionLines;
  }

  public PaySlip taxSettings(TaxSettings taxSettings) {
    this.taxSettings = taxSettings;
    return this;
  }

  /**
   * Get taxSettings
   *
   * @return taxSettings
   */
  @ApiModelProperty(value = "")
  public TaxSettings getTaxSettings() {
    return taxSettings;
  }

  public void setTaxSettings(TaxSettings taxSettings) {
    this.taxSettings = taxSettings;
  }

  public PaySlip grossEarningsHistory(GrossEarningsHistory grossEarningsHistory) {
    this.grossEarningsHistory = grossEarningsHistory;
    return this;
  }

  /**
   * Get grossEarningsHistory
   *
   * @return grossEarningsHistory
   */
  @ApiModelProperty(value = "")
  public GrossEarningsHistory getGrossEarningsHistory() {
    return grossEarningsHistory;
  }

  public void setGrossEarningsHistory(GrossEarningsHistory grossEarningsHistory) {
    this.grossEarningsHistory = grossEarningsHistory;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaySlip paySlip = (PaySlip) o;
    return Objects.equals(this.paySlipID, paySlip.paySlipID)
        && Objects.equals(this.employeeID, paySlip.employeeID)
        && Objects.equals(this.payRunID, paySlip.payRunID)
        && Objects.equals(this.lastEdited, paySlip.lastEdited)
        && Objects.equals(this.firstName, paySlip.firstName)
        && Objects.equals(this.lastName, paySlip.lastName)
        && Objects.equals(this.totalEarnings, paySlip.totalEarnings)
        && Objects.equals(this.grossEarnings, paySlip.grossEarnings)
        && Objects.equals(this.totalPay, paySlip.totalPay)
        && Objects.equals(this.totalEmployerTaxes, paySlip.totalEmployerTaxes)
        && Objects.equals(this.totalEmployeeTaxes, paySlip.totalEmployeeTaxes)
        && Objects.equals(this.totalDeductions, paySlip.totalDeductions)
        && Objects.equals(this.totalReimbursements, paySlip.totalReimbursements)
        && Objects.equals(this.totalStatutoryDeductions, paySlip.totalStatutoryDeductions)
        && Objects.equals(this.totalSuperannuation, paySlip.totalSuperannuation)
        && Objects.equals(this.bacsHash, paySlip.bacsHash)
        && Objects.equals(this.paymentMethod, paySlip.paymentMethod)
        && Objects.equals(this.earningsLines, paySlip.earningsLines)
        && Objects.equals(this.leaveEarningsLines, paySlip.leaveEarningsLines)
        && Objects.equals(this.timesheetEarningsLines, paySlip.timesheetEarningsLines)
        && Objects.equals(this.deductionLines, paySlip.deductionLines)
        && Objects.equals(this.reimbursementLines, paySlip.reimbursementLines)
        && Objects.equals(this.leaveAccrualLines, paySlip.leaveAccrualLines)
        && Objects.equals(this.superannuationLines, paySlip.superannuationLines)
        && Objects.equals(this.paymentLines, paySlip.paymentLines)
        && Objects.equals(this.employeeTaxLines, paySlip.employeeTaxLines)
        && Objects.equals(this.employerTaxLines, paySlip.employerTaxLines)
        && Objects.equals(this.statutoryDeductionLines, paySlip.statutoryDeductionLines)
        && Objects.equals(this.taxSettings, paySlip.taxSettings)
        && Objects.equals(this.grossEarningsHistory, paySlip.grossEarningsHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        paySlipID,
        employeeID,
        payRunID,
        lastEdited,
        firstName,
        lastName,
        totalEarnings,
        grossEarnings,
        totalPay,
        totalEmployerTaxes,
        totalEmployeeTaxes,
        totalDeductions,
        totalReimbursements,
        totalStatutoryDeductions,
        totalSuperannuation,
        bacsHash,
        paymentMethod,
        earningsLines,
        leaveEarningsLines,
        timesheetEarningsLines,
        deductionLines,
        reimbursementLines,
        leaveAccrualLines,
        superannuationLines,
        paymentLines,
        employeeTaxLines,
        employerTaxLines,
        statutoryDeductionLines,
        taxSettings,
        grossEarningsHistory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaySlip {\n");
    sb.append("    paySlipID: ").append(toIndentedString(paySlipID)).append("\n");
    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
    sb.append("    payRunID: ").append(toIndentedString(payRunID)).append("\n");
    sb.append("    lastEdited: ").append(toIndentedString(lastEdited)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    totalEarnings: ").append(toIndentedString(totalEarnings)).append("\n");
    sb.append("    grossEarnings: ").append(toIndentedString(grossEarnings)).append("\n");
    sb.append("    totalPay: ").append(toIndentedString(totalPay)).append("\n");
    sb.append("    totalEmployerTaxes: ").append(toIndentedString(totalEmployerTaxes)).append("\n");
    sb.append("    totalEmployeeTaxes: ").append(toIndentedString(totalEmployeeTaxes)).append("\n");
    sb.append("    totalDeductions: ").append(toIndentedString(totalDeductions)).append("\n");
    sb.append("    totalReimbursements: ")
        .append(toIndentedString(totalReimbursements))
        .append("\n");
    sb.append("    totalStatutoryDeductions: ")
        .append(toIndentedString(totalStatutoryDeductions))
        .append("\n");
    sb.append("    totalSuperannuation: ")
        .append(toIndentedString(totalSuperannuation))
        .append("\n");
    sb.append("    bacsHash: ").append(toIndentedString(bacsHash)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    earningsLines: ").append(toIndentedString(earningsLines)).append("\n");
    sb.append("    leaveEarningsLines: ").append(toIndentedString(leaveEarningsLines)).append("\n");
    sb.append("    timesheetEarningsLines: ")
        .append(toIndentedString(timesheetEarningsLines))
        .append("\n");
    sb.append("    deductionLines: ").append(toIndentedString(deductionLines)).append("\n");
    sb.append("    reimbursementLines: ").append(toIndentedString(reimbursementLines)).append("\n");
    sb.append("    leaveAccrualLines: ").append(toIndentedString(leaveAccrualLines)).append("\n");
    sb.append("    superannuationLines: ")
        .append(toIndentedString(superannuationLines))
        .append("\n");
    sb.append("    paymentLines: ").append(toIndentedString(paymentLines)).append("\n");
    sb.append("    employeeTaxLines: ").append(toIndentedString(employeeTaxLines)).append("\n");
    sb.append("    employerTaxLines: ").append(toIndentedString(employerTaxLines)).append("\n");
    sb.append("    statutoryDeductionLines: ")
        .append(toIndentedString(statutoryDeductionLines))
        .append("\n");
    sb.append("    taxSettings: ").append(toIndentedString(taxSettings)).append("\n");
    sb.append("    grossEarningsHistory: ")
        .append(toIndentedString(grossEarningsHistory))
        .append("\n");
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
