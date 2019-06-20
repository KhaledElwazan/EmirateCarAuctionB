
package com.example.myapplication.retrofit_api_response;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cars implements Serializable
{
    @Override
    public String toString() {
        return "Cars{" +
                "alertEn='" + alertEn + '\'' +
                ", alertAr='" + alertAr + '\'' +
                ", error=" + error +
                ", refreshInterval=" + refreshInterval +
                ", ticks='" + ticks + '\'' +
                ", count=" + count +
                ", endDate=" + endDate +
                ", sortOption='" + sortOption + '\'' +
                ", sortDirection='" + sortDirection + '\'' +
                ", cars=" + cars +
                '}';
    }

    @SerializedName("alertEn")
    @Expose
    private String alertEn;
    @SerializedName("alertAr")
    @Expose
    private String alertAr;
    @SerializedName("Error")
    @Expose
    private Error error;
    @SerializedName("RefreshInterval")
    @Expose
    private Integer refreshInterval;
    @SerializedName("Ticks")
    @Expose
    private String ticks;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("endDate")
    @Expose
    private Integer endDate;
    @SerializedName("sortOption")
    @Expose
    private String sortOption;
    @SerializedName("sortDirection")
    @Expose
    private String sortDirection;
    @SerializedName("Cars")
    @Expose
    private List<Car> cars = null;
    private final static long serialVersionUID = -7616924800221561140L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Cars() {
    }

    /**
     * 
     * @param sortOption
     * @param refreshInterval
     * @param count
     * @param error
     * @param ticks
     * @param cars
     * @param alertAr
     * @param endDate
     * @param alertEn
     * @param sortDirection
     */
    public Cars(String alertEn, String alertAr, Error error, Integer refreshInterval, String ticks, Integer count, Integer endDate, String sortOption, String sortDirection, List<Car> cars) {
        super();
        this.alertEn = alertEn;
        this.alertAr = alertAr;
        this.error = error;
        this.refreshInterval = refreshInterval;
        this.ticks = ticks;
        this.count = count;
        this.endDate = endDate;
        this.sortOption = sortOption;
        this.sortDirection = sortDirection;
        this.cars = cars;
    }

    public String getAlertEn() {
        return alertEn;
    }

    public void setAlertEn(String alertEn) {
        this.alertEn = alertEn;
    }

    public String getAlertAr() {
        return alertAr;
    }

    public void setAlertAr(String alertAr) {
        this.alertAr = alertAr;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public Integer getRefreshInterval() {
        return refreshInterval;
    }

    public void setRefreshInterval(Integer refreshInterval) {
        this.refreshInterval = refreshInterval;
    }

    public String getTicks() {
        return ticks;
    }

    public void setTicks(String ticks) {
        this.ticks = ticks;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getEndDate() {
        return endDate;
    }

    public void setEndDate(Integer endDate) {
        this.endDate = endDate;
    }

    public String getSortOption() {
        return sortOption;
    }

    public void setSortOption(String sortOption) {
        this.sortOption = sortOption;
    }

    public String getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

}
