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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;

/** EmployeeLeave */
public class EmployeeLeave {
  StringUtil util = new StringUtil();

  @JsonProperty("leaveID")
  private UUID leaveID;

  @JsonProperty("leaveTypeID")
  private UUID leaveTypeID;

  @JsonProperty("description")
  private String description;

  @JsonProperty("startDate")
  private LocalDate startDate;

  @JsonProperty("endDate")
  private LocalDate endDate;

  @JsonProperty("periods")
  private List<LeavePeriod> periods = new ArrayList<LeavePeriod>();

  @JsonProperty("updatedDateUTC")
  private LocalDateTime updatedDateUTC;

  public EmployeeLeave leaveID(UUID leaveID) {
    this.leaveID = leaveID;
    return this;
  }

  /**
   * The Xero identifier for LeaveType
   *
   * @return leaveID
   */
  @ApiModelProperty(value = "The Xero identifier for LeaveType")
  public UUID getLeaveID() {
    return leaveID;
  }

  public void setLeaveID(UUID leaveID) {
    this.leaveID = leaveID;
  }

  public EmployeeLeave leaveTypeID(UUID leaveTypeID) {
    this.leaveTypeID = leaveTypeID;
    return this;
  }

  /**
   * The Xero identifier for LeaveType
   *
   * @return leaveTypeID
   */
  @ApiModelProperty(required = true, value = "The Xero identifier for LeaveType")
  public UUID getLeaveTypeID() {
    return leaveTypeID;
  }

  public void setLeaveTypeID(UUID leaveTypeID) {
    this.leaveTypeID = leaveTypeID;
  }

  public EmployeeLeave description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the leave (max length &#x3D; 50)
   *
   * @return description
   */
  @ApiModelProperty(required = true, value = "The description of the leave  (max length = 50)")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EmployeeLeave startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start date of the leave (YYYY-MM-DD)
   *
   * @return startDate
   */
  @ApiModelProperty(required = true, value = "Start date of the leave (YYYY-MM-DD)")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public EmployeeLeave endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End date of the leave (YYYY-MM-DD)
   *
   * @return endDate
   */
  @ApiModelProperty(required = true, value = "End date of the leave (YYYY-MM-DD)")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public EmployeeLeave periods(List<LeavePeriod> periods) {
    this.periods = periods;
    return this;
  }

  public EmployeeLeave addPeriodsItem(LeavePeriod periodsItem) {
    if (this.periods == null) {
      this.periods = new ArrayList<LeavePeriod>();
    }
    this.periods.add(periodsItem);
    return this;
  }

  /**
   * The leave period information. The StartDate, EndDate and NumberOfUnits needs to be specified
   * when you do not want to calculate NumberOfUnits automatically. Using incorrect period StartDate
   * and EndDate will result in automatic computation of the NumberOfUnits.
   *
   * @return periods
   */
  @ApiModelProperty(
      value =
          "The leave period information. The StartDate, EndDate and NumberOfUnits needs to be"
              + " specified when you do not want to calculate NumberOfUnits automatically. Using"
              + " incorrect period StartDate and EndDate will result in automatic computation of"
              + " the NumberOfUnits.")
  public List<LeavePeriod> getPeriods() {
    return periods;
  }

  public void setPeriods(List<LeavePeriod> periods) {
    this.periods = periods;
  }

  public EmployeeLeave updatedDateUTC(LocalDateTime updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
    return this;
  }

  /**
   * UTC timestamp of last update to the leave type note
   *
   * @return updatedDateUTC
   */
  @ApiModelProperty(value = "UTC timestamp of last update to the leave type note")
  public LocalDateTime getUpdatedDateUTC() {
    return updatedDateUTC;
  }

  public void setUpdatedDateUTC(LocalDateTime updatedDateUTC) {
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
    EmployeeLeave employeeLeave = (EmployeeLeave) o;
    return Objects.equals(this.leaveID, employeeLeave.leaveID)
        && Objects.equals(this.leaveTypeID, employeeLeave.leaveTypeID)
        && Objects.equals(this.description, employeeLeave.description)
        && Objects.equals(this.startDate, employeeLeave.startDate)
        && Objects.equals(this.endDate, employeeLeave.endDate)
        && Objects.equals(this.periods, employeeLeave.periods)
        && Objects.equals(this.updatedDateUTC, employeeLeave.updatedDateUTC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        leaveID, leaveTypeID, description, startDate, endDate, periods, updatedDateUTC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeLeave {\n");
    sb.append("    leaveID: ").append(toIndentedString(leaveID)).append("\n");
    sb.append("    leaveTypeID: ").append(toIndentedString(leaveTypeID)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    periods: ").append(toIndentedString(periods)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
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
