
package com.example.myapplication.retrofit_api_response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AuctionInfo implements Serializable
{

    @SerializedName("bids")
    @Expose
    private Integer bids;
    @SerializedName("endDate")
    @Expose
    private Integer endDate;
    @SerializedName("endDateEn")
    @Expose
    private String endDateEn;
    @SerializedName("endDateAr")
    @Expose
    private String endDateAr;
    @SerializedName("currencyEn")
    @Expose
    private String currencyEn;
    @SerializedName("currencyAr")
    @Expose
    private String currencyAr;
    @SerializedName("currentPrice")
    @Expose
    private Integer currentPrice;
    @SerializedName("minIncrement")
    @Expose
    private Integer minIncrement;
    @SerializedName("lot")
    @Expose
    private Integer lot;
    @SerializedName("priority")
    @Expose
    private Integer priority;
    @SerializedName("VATPercent")
    @Expose
    private Integer vATPercent;
    @SerializedName("itemAuctionType")
    @Expose
    private Integer itemAuctionType;
    @SerializedName("isModified")
    @Expose
    private Integer isModified;
    @SerializedName("itemid")
    @Expose
    private Integer itemid;
    @SerializedName("iCarId")
    @Expose
    private Integer iCarId;
    @SerializedName("iVinNumber")
    @Expose
    private String iVinNumber;
    private final static long serialVersionUID = 5560024153477551704L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AuctionInfo() {
    }

    /**
     * 
     * @param iVinNumber
     * @param isModified
     * @param endDateAr
     * @param endDateEn
     * @param vATPercent
     * @param minIncrement
     * @param bids
     * @param endDate
     * @param currencyEn
     * @param currentPrice
     * @param itemid
     * @param priority
     * @param iCarId
     * @param currencyAr
     * @param lot
     * @param itemAuctionType
     */
    public AuctionInfo(Integer bids, Integer endDate, String endDateEn, String endDateAr, String currencyEn, String currencyAr, Integer currentPrice, Integer minIncrement, Integer lot, Integer priority, Integer vATPercent, Integer itemAuctionType, Integer isModified, Integer itemid, Integer iCarId, String iVinNumber) {
        super();
        this.bids = bids;
        this.endDate = endDate;
        this.endDateEn = endDateEn;
        this.endDateAr = endDateAr;
        this.currencyEn = currencyEn;
        this.currencyAr = currencyAr;
        this.currentPrice = currentPrice;
        this.minIncrement = minIncrement;
        this.lot = lot;
        this.priority = priority;
        this.vATPercent = vATPercent;
        this.itemAuctionType = itemAuctionType;
        this.isModified = isModified;
        this.itemid = itemid;
        this.iCarId = iCarId;
        this.iVinNumber = iVinNumber;
    }

    public Integer getBids() {
        return bids;
    }

    public void setBids(Integer bids) {
        this.bids = bids;
    }

    public Integer getEndDate() {
        return endDate;
    }

    public void setEndDate(Integer endDate) {
        this.endDate = endDate;
    }

    public String getEndDateEn() {
        return endDateEn;
    }

    public void setEndDateEn(String endDateEn) {
        this.endDateEn = endDateEn;
    }

    public String getEndDateAr() {
        return endDateAr;
    }

    public void setEndDateAr(String endDateAr) {
        this.endDateAr = endDateAr;
    }

    public String getCurrencyEn() {
        return currencyEn;
    }

    public void setCurrencyEn(String currencyEn) {
        this.currencyEn = currencyEn;
    }

    public String getCurrencyAr() {
        return currencyAr;
    }

    public void setCurrencyAr(String currencyAr) {
        this.currencyAr = currencyAr;
    }

    public Integer getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Integer currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Integer getMinIncrement() {
        return minIncrement;
    }

    public void setMinIncrement(Integer minIncrement) {
        this.minIncrement = minIncrement;
    }

    public Integer getLot() {
        return lot;
    }

    public void setLot(Integer lot) {
        this.lot = lot;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getVATPercent() {
        return vATPercent;
    }

    public void setVATPercent(Integer vATPercent) {
        this.vATPercent = vATPercent;
    }

    public Integer getItemAuctionType() {
        return itemAuctionType;
    }

    public void setItemAuctionType(Integer itemAuctionType) {
        this.itemAuctionType = itemAuctionType;
    }

    public Integer getIsModified() {
        return isModified;
    }

    public void setIsModified(Integer isModified) {
        this.isModified = isModified;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public Integer getICarId() {
        return iCarId;
    }

    public void setICarId(Integer iCarId) {
        this.iCarId = iCarId;
    }

    public String getIVinNumber() {
        return iVinNumber;
    }

    public void setIVinNumber(String iVinNumber) {
        this.iVinNumber = iVinNumber;
    }

    @Override
    public String toString() {
        return "AuctionInfo{" +
                "bids=" + bids +
                ", endDate=" + endDate +
                ", endDateEn='" + endDateEn + '\'' +
                ", endDateAr='" + endDateAr + '\'' +
                ", currencyEn='" + currencyEn + '\'' +
                ", currencyAr='" + currencyAr + '\'' +
                ", currentPrice=" + currentPrice +
                ", minIncrement=" + minIncrement +
                ", lot=" + lot +
                ", priority=" + priority +
                ", vATPercent=" + vATPercent +
                ", itemAuctionType=" + itemAuctionType +
                ", isModified=" + isModified +
                ", itemid=" + itemid +
                ", iCarId=" + iCarId +
                ", iVinNumber='" + iVinNumber + '\'' +
                '}';
    }



}
