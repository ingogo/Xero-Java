/*
 * Xero Assets API
 * This is the Xero Assets API
 *
 * The version of the OpenAPI document: 2.3.7
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.assets;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.LocalDate;

/** Asset */
public class Asset {
  StringUtil util = new StringUtil();

  @JsonProperty("assetId")
  private UUID assetId;

  @JsonProperty("assetName")
  private String assetName;

  @JsonProperty("assetTypeId")
  private UUID assetTypeId;

  @JsonProperty("assetNumber")
  private String assetNumber;

  @JsonProperty("purchaseDate")
  private LocalDate purchaseDate;

  @JsonProperty("purchasePrice")
  private Double purchasePrice;

  @JsonProperty("disposalPrice")
  private Double disposalPrice;

  @JsonProperty("assetStatus")
  private AssetStatus assetStatus;

  @JsonProperty("warrantyExpiryDate")
  private String warrantyExpiryDate;

  @JsonProperty("serialNumber")
  private String serialNumber;

  @JsonProperty("bookDepreciationSetting")
  private BookDepreciationSetting bookDepreciationSetting;

  @JsonProperty("bookDepreciationDetail")
  private BookDepreciationDetail bookDepreciationDetail;

  @JsonProperty("canRollback")
  private Boolean canRollback;

  @JsonProperty("accountingBookValue")
  private Double accountingBookValue;

  @JsonProperty("isDeleteEnabledForDate")
  private Boolean isDeleteEnabledForDate;

  public Asset assetId(UUID assetId) {
    this.assetId = assetId;
    return this;
  }

  /**
   * The Xero-generated Id for the asset
   *
   * @return assetId
   */
  @ApiModelProperty(
      example = "3b5b3a38-5649-495f-87a1-14a4e5918634",
      value = "The Xero-generated Id for the asset")
  public UUID getAssetId() {
    return assetId;
  }

  public void setAssetId(UUID assetId) {
    this.assetId = assetId;
  }

  public Asset assetName(String assetName) {
    this.assetName = assetName;
    return this;
  }

  /**
   * The name of the asset
   *
   * @return assetName
   */
  @ApiModelProperty(example = "Awesome Truck 3", required = true, value = "The name of the asset")
  public String getAssetName() {
    return assetName;
  }

  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }

  public Asset assetTypeId(UUID assetTypeId) {
    this.assetTypeId = assetTypeId;
    return this;
  }

  /**
   * The Xero-generated Id for the asset type
   *
   * @return assetTypeId
   */
  @ApiModelProperty(
      example = "3b5b3a38-5649-495f-87a1-14a4e5918634",
      value = "The Xero-generated Id for the asset type")
  public UUID getAssetTypeId() {
    return assetTypeId;
  }

  public void setAssetTypeId(UUID assetTypeId) {
    this.assetTypeId = assetTypeId;
  }

  public Asset assetNumber(String assetNumber) {
    this.assetNumber = assetNumber;
    return this;
  }

  /**
   * Must be unique.
   *
   * @return assetNumber
   */
  @ApiModelProperty(example = "FA-0013", value = "Must be unique.")
  public String getAssetNumber() {
    return assetNumber;
  }

  public void setAssetNumber(String assetNumber) {
    this.assetNumber = assetNumber;
  }

  public Asset purchaseDate(LocalDate purchaseDate) {
    this.purchaseDate = purchaseDate;
    return this;
  }

  /**
   * The date the asset was purchased YYYY-MM-DD
   *
   * @return purchaseDate
   */
  @ApiModelProperty(value = "The date the asset was purchased YYYY-MM-DD")
  public LocalDate getPurchaseDate() {
    return purchaseDate;
  }

  public void setPurchaseDate(LocalDate purchaseDate) {
    this.purchaseDate = purchaseDate;
  }

  public Asset purchasePrice(Double purchasePrice) {
    this.purchasePrice = purchasePrice;
    return this;
  }

  /**
   * The purchase price of the asset
   *
   * @return purchasePrice
   */
  @ApiModelProperty(example = "1000.0000", value = "The purchase price of the asset")
  public Double getPurchasePrice() {
    return purchasePrice;
  }

  public void setPurchasePrice(Double purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  public Asset disposalPrice(Double disposalPrice) {
    this.disposalPrice = disposalPrice;
    return this;
  }

  /**
   * The price the asset was disposed at
   *
   * @return disposalPrice
   */
  @ApiModelProperty(example = "1.0000", value = "The price the asset was disposed at")
  public Double getDisposalPrice() {
    return disposalPrice;
  }

  public void setDisposalPrice(Double disposalPrice) {
    this.disposalPrice = disposalPrice;
  }

  public Asset assetStatus(AssetStatus assetStatus) {
    this.assetStatus = assetStatus;
    return this;
  }

  /**
   * Get assetStatus
   *
   * @return assetStatus
   */
  @ApiModelProperty(value = "")
  public AssetStatus getAssetStatus() {
    return assetStatus;
  }

  public void setAssetStatus(AssetStatus assetStatus) {
    this.assetStatus = assetStatus;
  }

  public Asset warrantyExpiryDate(String warrantyExpiryDate) {
    this.warrantyExpiryDate = warrantyExpiryDate;
    return this;
  }

  /**
   * The date the asset’s warranty expires (if needed) YYYY-MM-DD
   *
   * @return warrantyExpiryDate
   */
  @ApiModelProperty(
      example = "ca4c6b39-4f4f-43e8-98da-5e1f350a6694",
      value = "The date the asset’s warranty expires (if needed) YYYY-MM-DD")
  public String getWarrantyExpiryDate() {
    return warrantyExpiryDate;
  }

  public void setWarrantyExpiryDate(String warrantyExpiryDate) {
    this.warrantyExpiryDate = warrantyExpiryDate;
  }

  public Asset serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * The asset&#39;s serial number
   *
   * @return serialNumber
   */
  @ApiModelProperty(
      example = "ca4c6b39-4f4f-43e8-98da-5e1f350a6694",
      value = "The asset's serial number")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public Asset bookDepreciationSetting(BookDepreciationSetting bookDepreciationSetting) {
    this.bookDepreciationSetting = bookDepreciationSetting;
    return this;
  }

  /**
   * Get bookDepreciationSetting
   *
   * @return bookDepreciationSetting
   */
  @ApiModelProperty(value = "")
  public BookDepreciationSetting getBookDepreciationSetting() {
    return bookDepreciationSetting;
  }

  public void setBookDepreciationSetting(BookDepreciationSetting bookDepreciationSetting) {
    this.bookDepreciationSetting = bookDepreciationSetting;
  }

  public Asset bookDepreciationDetail(BookDepreciationDetail bookDepreciationDetail) {
    this.bookDepreciationDetail = bookDepreciationDetail;
    return this;
  }

  /**
   * Get bookDepreciationDetail
   *
   * @return bookDepreciationDetail
   */
  @ApiModelProperty(value = "")
  public BookDepreciationDetail getBookDepreciationDetail() {
    return bookDepreciationDetail;
  }

  public void setBookDepreciationDetail(BookDepreciationDetail bookDepreciationDetail) {
    this.bookDepreciationDetail = bookDepreciationDetail;
  }

  public Asset canRollback(Boolean canRollback) {
    this.canRollback = canRollback;
    return this;
  }

  /**
   * Boolean to indicate whether depreciation can be rolled back for this asset individually. This
   * is true if it doesn&#39;t have &#39;legacy&#39; journal entries and if there is no lock period
   * that would prevent this asset from rolling back.
   *
   * @return canRollback
   */
  @ApiModelProperty(
      example = "true",
      value =
          "Boolean to indicate whether depreciation can be rolled back for this asset"
              + " individually. This is true if it doesn't have 'legacy' journal entries and if"
              + " there is no lock period that would prevent this asset from rolling back.")
  public Boolean getCanRollback() {
    return canRollback;
  }

  public void setCanRollback(Boolean canRollback) {
    this.canRollback = canRollback;
  }

  public Asset accountingBookValue(Double accountingBookValue) {
    this.accountingBookValue = accountingBookValue;
    return this;
  }

  /**
   * The accounting value of the asset
   *
   * @return accountingBookValue
   */
  @ApiModelProperty(example = "0", value = "The accounting value of the asset")
  public Double getAccountingBookValue() {
    return accountingBookValue;
  }

  public void setAccountingBookValue(Double accountingBookValue) {
    this.accountingBookValue = accountingBookValue;
  }

  public Asset isDeleteEnabledForDate(Boolean isDeleteEnabledForDate) {
    this.isDeleteEnabledForDate = isDeleteEnabledForDate;
    return this;
  }

  /**
   * Boolean to indicate whether delete is enabled
   *
   * @return isDeleteEnabledForDate
   */
  @ApiModelProperty(example = "true", value = "Boolean to indicate whether delete is enabled")
  public Boolean getIsDeleteEnabledForDate() {
    return isDeleteEnabledForDate;
  }

  public void setIsDeleteEnabledForDate(Boolean isDeleteEnabledForDate) {
    this.isDeleteEnabledForDate = isDeleteEnabledForDate;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Asset asset = (Asset) o;
    return Objects.equals(this.assetId, asset.assetId)
        && Objects.equals(this.assetName, asset.assetName)
        && Objects.equals(this.assetTypeId, asset.assetTypeId)
        && Objects.equals(this.assetNumber, asset.assetNumber)
        && Objects.equals(this.purchaseDate, asset.purchaseDate)
        && Objects.equals(this.purchasePrice, asset.purchasePrice)
        && Objects.equals(this.disposalPrice, asset.disposalPrice)
        && Objects.equals(this.assetStatus, asset.assetStatus)
        && Objects.equals(this.warrantyExpiryDate, asset.warrantyExpiryDate)
        && Objects.equals(this.serialNumber, asset.serialNumber)
        && Objects.equals(this.bookDepreciationSetting, asset.bookDepreciationSetting)
        && Objects.equals(this.bookDepreciationDetail, asset.bookDepreciationDetail)
        && Objects.equals(this.canRollback, asset.canRollback)
        && Objects.equals(this.accountingBookValue, asset.accountingBookValue)
        && Objects.equals(this.isDeleteEnabledForDate, asset.isDeleteEnabledForDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assetId,
        assetName,
        assetTypeId,
        assetNumber,
        purchaseDate,
        purchasePrice,
        disposalPrice,
        assetStatus,
        warrantyExpiryDate,
        serialNumber,
        bookDepreciationSetting,
        bookDepreciationDetail,
        canRollback,
        accountingBookValue,
        isDeleteEnabledForDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Asset {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
    sb.append("    assetTypeId: ").append(toIndentedString(assetTypeId)).append("\n");
    sb.append("    assetNumber: ").append(toIndentedString(assetNumber)).append("\n");
    sb.append("    purchaseDate: ").append(toIndentedString(purchaseDate)).append("\n");
    sb.append("    purchasePrice: ").append(toIndentedString(purchasePrice)).append("\n");
    sb.append("    disposalPrice: ").append(toIndentedString(disposalPrice)).append("\n");
    sb.append("    assetStatus: ").append(toIndentedString(assetStatus)).append("\n");
    sb.append("    warrantyExpiryDate: ").append(toIndentedString(warrantyExpiryDate)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    bookDepreciationSetting: ")
        .append(toIndentedString(bookDepreciationSetting))
        .append("\n");
    sb.append("    bookDepreciationDetail: ")
        .append(toIndentedString(bookDepreciationDetail))
        .append("\n");
    sb.append("    canRollback: ").append(toIndentedString(canRollback)).append("\n");
    sb.append("    accountingBookValue: ")
        .append(toIndentedString(accountingBookValue))
        .append("\n");
    sb.append("    isDeleteEnabledForDate: ")
        .append(toIndentedString(isDeleteEnabledForDate))
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
