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
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ReportRows */
public class ReportRows {
  StringUtil util = new StringUtil();

  @JsonProperty("RowType")
  private RowType rowType;

  @JsonProperty("Title")
  private String title;

  @JsonProperty("Cells")
  private List<ReportCell> cells = new ArrayList<ReportCell>();

  @JsonProperty("Rows")
  private List<ReportRow> rows = new ArrayList<ReportRow>();

  public ReportRows rowType(RowType rowType) {
    this.rowType = rowType;
    return this;
  }

  /**
   * Get rowType
   *
   * @return rowType
   */
  @ApiModelProperty(value = "")
  public RowType getRowType() {
    return rowType;
  }

  public void setRowType(RowType rowType) {
    this.rowType = rowType;
  }

  public ReportRows title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   *
   * @return title
   */
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ReportRows cells(List<ReportCell> cells) {
    this.cells = cells;
    return this;
  }

  public ReportRows addCellsItem(ReportCell cellsItem) {
    if (this.cells == null) {
      this.cells = new ArrayList<ReportCell>();
    }
    this.cells.add(cellsItem);
    return this;
  }

  /**
   * Get cells
   *
   * @return cells
   */
  @ApiModelProperty(value = "")
  public List<ReportCell> getCells() {
    return cells;
  }

  public void setCells(List<ReportCell> cells) {
    this.cells = cells;
  }

  public ReportRows rows(List<ReportRow> rows) {
    this.rows = rows;
    return this;
  }

  public ReportRows addRowsItem(ReportRow rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<ReportRow>();
    }
    this.rows.add(rowsItem);
    return this;
  }

  /**
   * Get rows
   *
   * @return rows
   */
  @ApiModelProperty(value = "")
  public List<ReportRow> getRows() {
    return rows;
  }

  public void setRows(List<ReportRow> rows) {
    this.rows = rows;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportRows reportRows = (ReportRows) o;
    return Objects.equals(this.rowType, reportRows.rowType)
        && Objects.equals(this.title, reportRows.title)
        && Objects.equals(this.cells, reportRows.cells)
        && Objects.equals(this.rows, reportRows.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rowType, title, cells, rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportRows {\n");
    sb.append("    rowType: ").append(toIndentedString(rowType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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
