/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * The version of the OpenAPI document: 2.3.7
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrolluk;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;

/** EmployeeLeaveType */
public class EmployeeLeaveType {
  StringUtil util = new StringUtil();

  @JsonProperty("leaveTypeID")
  private UUID leaveTypeID;
  /** The schedule of accrual */
  public enum ScheduleOfAccrualEnum {
    BEGINNINGOFCALENDARYEAR("BeginningOfCalendarYear"),

    ONANNIVERSARYDATE("OnAnniversaryDate"),

    EACHPAYPERIOD("EachPayPeriod"),

    ONHOURWORKED("OnHourWorked");

    private String value;

    ScheduleOfAccrualEnum(String value) {
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
    public static ScheduleOfAccrualEnum fromValue(String value) {
      for (ScheduleOfAccrualEnum b : ScheduleOfAccrualEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("scheduleOfAccrual")
  private ScheduleOfAccrualEnum scheduleOfAccrual;

  @JsonProperty("hoursAccruedAnnually")
  private Double hoursAccruedAnnually;

  @JsonProperty("maximumToAccrue")
  private Double maximumToAccrue;

  @JsonProperty("openingBalance")
  private Double openingBalance;

  @JsonProperty("rateAccruedHourly")
  private Double rateAccruedHourly;

  public EmployeeLeaveType leaveTypeID(UUID leaveTypeID) {
    this.leaveTypeID = leaveTypeID;
    return this;
  }

  /**
   * The Xero identifier for leave type
   *
   * @return leaveTypeID
   */
  @ApiModelProperty(required = true, value = "The Xero identifier for leave type")
  public UUID getLeaveTypeID() {
    return leaveTypeID;
  }

  public void setLeaveTypeID(UUID leaveTypeID) {
    this.leaveTypeID = leaveTypeID;
  }

  public EmployeeLeaveType scheduleOfAccrual(ScheduleOfAccrualEnum scheduleOfAccrual) {
    this.scheduleOfAccrual = scheduleOfAccrual;
    return this;
  }

  /**
   * The schedule of accrual
   *
   * @return scheduleOfAccrual
   */
  @ApiModelProperty(required = true, value = "The schedule of accrual")
  public ScheduleOfAccrualEnum getScheduleOfAccrual() {
    return scheduleOfAccrual;
  }

  public void setScheduleOfAccrual(ScheduleOfAccrualEnum scheduleOfAccrual) {
    this.scheduleOfAccrual = scheduleOfAccrual;
  }

  public EmployeeLeaveType hoursAccruedAnnually(Double hoursAccruedAnnually) {
    this.hoursAccruedAnnually = hoursAccruedAnnually;
    return this;
  }

  /**
   * The number of hours accrued for the leave annually. This is 0 when the scheduleOfAccrual chosen
   * is \&quot;OnHourWorked\&quot;
   *
   * @return hoursAccruedAnnually
   */
  @ApiModelProperty(
      value =
          "The number of hours accrued for the leave annually. This is 0 when the"
              + " scheduleOfAccrual chosen is \"OnHourWorked\"")
  public Double getHoursAccruedAnnually() {
    return hoursAccruedAnnually;
  }

  public void setHoursAccruedAnnually(Double hoursAccruedAnnually) {
    this.hoursAccruedAnnually = hoursAccruedAnnually;
  }

  public EmployeeLeaveType maximumToAccrue(Double maximumToAccrue) {
    this.maximumToAccrue = maximumToAccrue;
    return this;
  }

  /**
   * The maximum number of hours that can be accrued for the leave
   *
   * @return maximumToAccrue
   */
  @ApiModelProperty(value = "The maximum number of hours that can be accrued for the leave")
  public Double getMaximumToAccrue() {
    return maximumToAccrue;
  }

  public void setMaximumToAccrue(Double maximumToAccrue) {
    this.maximumToAccrue = maximumToAccrue;
  }

  public EmployeeLeaveType openingBalance(Double openingBalance) {
    this.openingBalance = openingBalance;
    return this;
  }

  /**
   * The initial number of hours assigned when the leave was added to the employee
   *
   * @return openingBalance
   */
  @ApiModelProperty(
      value = "The initial number of hours assigned when the leave was added to the employee")
  public Double getOpeningBalance() {
    return openingBalance;
  }

  public void setOpeningBalance(Double openingBalance) {
    this.openingBalance = openingBalance;
  }

  public EmployeeLeaveType rateAccruedHourly(Double rateAccruedHourly) {
    this.rateAccruedHourly = rateAccruedHourly;
    return this;
  }

  /**
   * The number of hours added to the leave balance for every hour worked by the employee. This is
   * normally 0, unless the scheduleOfAccrual chosen is \&quot;OnHourWorked\&quot;
   *
   * @return rateAccruedHourly
   */
  @ApiModelProperty(
      value =
          "The number of hours added to the leave balance for every hour worked by the employee."
              + " This is normally 0, unless the scheduleOfAccrual chosen is \"OnHourWorked\"")
  public Double getRateAccruedHourly() {
    return rateAccruedHourly;
  }

  public void setRateAccruedHourly(Double rateAccruedHourly) {
    this.rateAccruedHourly = rateAccruedHourly;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeLeaveType employeeLeaveType = (EmployeeLeaveType) o;
    return Objects.equals(this.leaveTypeID, employeeLeaveType.leaveTypeID)
        && Objects.equals(this.scheduleOfAccrual, employeeLeaveType.scheduleOfAccrual)
        && Objects.equals(this.hoursAccruedAnnually, employeeLeaveType.hoursAccruedAnnually)
        && Objects.equals(this.maximumToAccrue, employeeLeaveType.maximumToAccrue)
        && Objects.equals(this.openingBalance, employeeLeaveType.openingBalance)
        && Objects.equals(this.rateAccruedHourly, employeeLeaveType.rateAccruedHourly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        leaveTypeID,
        scheduleOfAccrual,
        hoursAccruedAnnually,
        maximumToAccrue,
        openingBalance,
        rateAccruedHourly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeLeaveType {\n");
    sb.append("    leaveTypeID: ").append(toIndentedString(leaveTypeID)).append("\n");
    sb.append("    scheduleOfAccrual: ").append(toIndentedString(scheduleOfAccrual)).append("\n");
    sb.append("    hoursAccruedAnnually: ")
        .append(toIndentedString(hoursAccruedAnnually))
        .append("\n");
    sb.append("    maximumToAccrue: ").append(toIndentedString(maximumToAccrue)).append("\n");
    sb.append("    openingBalance: ").append(toIndentedString(openingBalance)).append("\n");
    sb.append("    rateAccruedHourly: ").append(toIndentedString(rateAccruedHourly)).append("\n");
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
