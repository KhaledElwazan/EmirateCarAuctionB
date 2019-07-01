
package com.example.myapplication.retrofit_api_response;

import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;


@Entity
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

    @ColumnInfo(name = "carID")
    @SerializedName("carID")
    @Expose
    @PrimaryKey
    @NonNull
    private Integer carID;
    @ColumnInfo(name = "image")
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("descriptionAr")
    @Expose
    @ColumnInfo(name = "descriptionAr")
    private String descriptionAr;
    @ColumnInfo(name = "descriptionEn")
    @SerializedName("descriptionEn")
    @Expose
    private String descriptionEn;
    @ColumnInfo(name = "imgCount")
    @SerializedName("imgCount")
    @Expose
    private Integer imgCount;
    @SerializedName("sharingLink")
    @ColumnInfo(name = "sharingLink")
    @Expose
    private String sharingLink;
    @SerializedName("sharingMsgEn")
    @ColumnInfo(name = "sharingMsgEn")
    @Expose
    private String sharingMsgEn;
    @SerializedName("sharingMsgAr")
    @ColumnInfo(name = "sharingMsgAr")
    @Expose
    private String sharingMsgAr;
    @SerializedName("mileage")
    @ColumnInfo(name = "mileage")
    @Expose
    private String mileage;
    @SerializedName("makeID")
    @ColumnInfo(name = "makeID")
    @Expose
    private Integer makeID;
    @SerializedName("modelID")
    @ColumnInfo(name = "modelID")
    @Expose
    private Integer modelID;
    @SerializedName("bodyId")
    @ColumnInfo(name = "bodyId")
    @Expose
    private Integer bodyId;
    @SerializedName("year")
    @ColumnInfo(name = "year")
    @Expose
    private Integer year;
    @SerializedName("makeEn")
    @ColumnInfo(name = "makeEn")
    @Expose
    private String makeEn;
    @SerializedName("makeAr")
    @ColumnInfo(name = "makeAr")
    @Expose
    private String makeAr;
    @SerializedName("modelEn")
    @ColumnInfo(name = "modelEn")
    @Expose
    private String modelEn;
    @SerializedName("modelAr")
    @Expose
    private String modelAr;
    @ColumnInfo(name = "bodyEn")
    @SerializedName("bodyEn")
    @Expose
    private String bodyEn;
    @SerializedName("bodyAr")
    @ColumnInfo(name = "bodyAr")
    @Expose
    private String bodyAr;
    @ColumnInfo(name = "AuctionInfo")
    @SerializedName("AuctionInfo")
    @Expose
    @TypeConverters({DataConverter.class})
    private AuctionInfo auctionInfo;
    private final static long serialVersionUID = 4070382264665154877L;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return carID.equals(car.carID) &&
                Objects.equals(image, car.image) &&
                Objects.equals(descriptionAr, car.descriptionAr) &&
                Objects.equals(descriptionEn, car.descriptionEn) &&
                Objects.equals(imgCount, car.imgCount) &&
                Objects.equals(sharingLink, car.sharingLink) &&
                Objects.equals(sharingMsgEn, car.sharingMsgEn) &&
                Objects.equals(sharingMsgAr, car.sharingMsgAr) &&
                Objects.equals(mileage, car.mileage) &&
                Objects.equals(makeID, car.makeID) &&
                Objects.equals(modelID, car.modelID) &&
                Objects.equals(bodyId, car.bodyId) &&
                Objects.equals(year, car.year) &&
                Objects.equals(makeEn, car.makeEn) &&
                Objects.equals(makeAr, car.makeAr) &&
                Objects.equals(modelEn, car.modelEn) &&
                Objects.equals(modelAr, car.modelAr) &&
                Objects.equals(bodyEn, car.bodyEn) &&
                Objects.equals(bodyAr, car.bodyAr) &&
                Objects.equals(auctionInfo, car.auctionInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carID, image, descriptionAr, descriptionEn, imgCount, sharingLink, sharingMsgEn, sharingMsgAr, mileage, makeID, modelID, bodyId, year, makeEn, makeAr, modelEn, modelAr, bodyEn, bodyAr, auctionInfo);
    }

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
