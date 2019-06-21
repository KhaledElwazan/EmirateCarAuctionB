
package com.example.myapplication.retrofit_api_response;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Car implements Serializable, Comparable<Car> {
    @Override
    public String toString() {
        return "Car{" +
                "carID=" + carID +
                ", image='" + image + '\'' +
                ", descriptionAr='" + descriptionAr + '\'' +
                ", descriptionEn='" + descriptionEn + '\'' +
                ", imgCount=" + imgCount +
                ", sharingLink='" + sharingLink + '\'' +
                ", sharingMsgEn='" + sharingMsgEn + '\'' +
                ", sharingMsgAr='" + sharingMsgAr + '\'' +
                ", mileage='" + mileage + '\'' +
                ", makeID=" + makeID +
                ", modelID=" + modelID +
                ", bodyId=" + bodyId +
                ", year=" + year +
                ", makeEn='" + makeEn + '\'' +
                ", makeAr='" + makeAr + '\'' +
                ", modelEn='" + modelEn + '\'' +
                ", modelAr='" + modelAr + '\'' +
                ", bodyEn='" + bodyEn + '\'' +
                ", bodyAr='" + bodyAr + '\'' +
                ", auctionInfo=" + auctionInfo +
                '}';
    }

    @SerializedName("carID")
    @Expose
    private Integer carID;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("descriptionAr")
    @Expose
    private String descriptionAr;
    @SerializedName("descriptionEn")
    @Expose
    private String descriptionEn;
    @SerializedName("imgCount")
    @Expose
    private Integer imgCount;
    @SerializedName("sharingLink")
    @Expose
    private String sharingLink;
    @SerializedName("sharingMsgEn")
    @Expose
    private String sharingMsgEn;
    @SerializedName("sharingMsgAr")
    @Expose
    private String sharingMsgAr;
    @SerializedName("mileage")
    @Expose
    private String mileage;
    @SerializedName("makeID")
    @Expose
    private Integer makeID;
    @SerializedName("modelID")
    @Expose
    private Integer modelID;
    @SerializedName("bodyId")
    @Expose
    private Integer bodyId;
    @SerializedName("year")
    @Expose
    private Integer year;
    @SerializedName("makeEn")
    @Expose
    private String makeEn;
    @SerializedName("makeAr")
    @Expose
    private String makeAr;
    @SerializedName("modelEn")
    @Expose
    private String modelEn;
    @SerializedName("modelAr")
    @Expose
    private String modelAr;
    @SerializedName("bodyEn")
    @Expose
    private String bodyEn;
    @SerializedName("bodyAr")
    @Expose
    private String bodyAr;
    @SerializedName("AuctionInfo")
    @Expose
    private AuctionInfo auctionInfo;
    private final static long serialVersionUID = 4070382264665154877L;

    /**
     * No args constructor for use in serialization
     */
    public Car() {
    }

    /**
     * @param sharingLink
     * @param mileage
     * @param sharingMsgEn
     * @param bodyEn
     * @param descriptionEn
     * @param descriptionAr
     * @param image
     * @param bodyId
     * @param makeEn
     * @param modelID
     * @param carID
     * @param sharingMsgAr
     * @param bodyAr
     * @param modelEn
     * @param auctionInfo
     * @param modelAr
     * @param year
     * @param makeID
     * @param imgCount
     * @param makeAr
     */
    public Car(Integer carID, String image, String descriptionAr, String descriptionEn, Integer imgCount, String sharingLink, String sharingMsgEn, String sharingMsgAr, String mileage, Integer makeID, Integer modelID, Integer bodyId, Integer year, String makeEn, String makeAr, String modelEn, String modelAr, String bodyEn, String bodyAr, AuctionInfo auctionInfo) {
        super();
        this.carID = carID;
        this.image = image;
        this.descriptionAr = descriptionAr;
        this.descriptionEn = descriptionEn;
        this.imgCount = imgCount;
        this.sharingLink = sharingLink;
        this.sharingMsgEn = sharingMsgEn;
        this.sharingMsgAr = sharingMsgAr;
        this.mileage = mileage;
        this.makeID = makeID;
        this.modelID = modelID;
        this.bodyId = bodyId;
        this.year = year;
        this.makeEn = makeEn;
        this.makeAr = makeAr;
        this.modelEn = modelEn;
        this.modelAr = modelAr;
        this.bodyEn = bodyEn;
        this.bodyAr = bodyAr;
        this.auctionInfo = auctionInfo;
    }

    public Integer getCarID() {
        return carID;
    }

    public void setCarID(Integer carID) {
        this.carID = carID;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescriptionAr() {
        return descriptionAr;
    }

    public void setDescriptionAr(String descriptionAr) {
        this.descriptionAr = descriptionAr;
    }

    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public Integer getImgCount() {
        return imgCount;
    }

    public void setImgCount(Integer imgCount) {
        this.imgCount = imgCount;
    }

    public String getSharingLink() {
        return sharingLink;
    }

    public void setSharingLink(String sharingLink) {
        this.sharingLink = sharingLink;
    }

    public String getSharingMsgEn() {
        return sharingMsgEn;
    }

    public void setSharingMsgEn(String sharingMsgEn) {
        this.sharingMsgEn = sharingMsgEn;
    }

    public String getSharingMsgAr() {
        return sharingMsgAr;
    }

    public void setSharingMsgAr(String sharingMsgAr) {
        this.sharingMsgAr = sharingMsgAr;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public Integer getMakeID() {
        return makeID;
    }

    public void setMakeID(Integer makeID) {
        this.makeID = makeID;
    }

    public Integer getModelID() {
        return modelID;
    }

    public void setModelID(Integer modelID) {
        this.modelID = modelID;
    }

    public Integer getBodyId() {
        return bodyId;
    }

    public void setBodyId(Integer bodyId) {
        this.bodyId = bodyId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getMakeEn() {
        return makeEn;
    }

    public void setMakeEn(String makeEn) {
        this.makeEn = makeEn;
    }

    public String getMakeAr() {
        return makeAr;
    }

    public void setMakeAr(String makeAr) {
        this.makeAr = makeAr;
    }

    public String getModelEn() {
        return modelEn;
    }

    public void setModelEn(String modelEn) {
        this.modelEn = modelEn;
    }

    public String getModelAr() {
        return modelAr;
    }

    public void setModelAr(String modelAr) {
        this.modelAr = modelAr;
    }

    public String getBodyEn() {
        return bodyEn;
    }

    public void setBodyEn(String bodyEn) {
        this.bodyEn = bodyEn;
    }

    public String getBodyAr() {
        return bodyAr;
    }

    public void setBodyAr(String bodyAr) {
        this.bodyAr = bodyAr;
    }

    public AuctionInfo getAuctionInfo() {
        return auctionInfo;
    }

    public void setAuctionInfo(AuctionInfo auctionInfo) {
        this.auctionInfo = auctionInfo;
    }


    @Override
    public int compareTo(Car car) {
        return this.getAuctionInfo().getCurrentPrice() - car.getAuctionInfo().getCurrentPrice();
    }
}
