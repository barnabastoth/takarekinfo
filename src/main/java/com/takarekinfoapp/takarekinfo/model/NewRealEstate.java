package com.takarekinfoapp.takarekinfo.model;

public class NewRealEstate {

    private Integer baseAreaInSquareMeters;
    private double longitude;
    private double latitude;

    public Integer getBaseAreaInSquareMeters() {
        return baseAreaInSquareMeters;
    }

    public void setBaseAreaInSquareMeters(Integer baseAreaInSquareMeters) {
        this.baseAreaInSquareMeters = baseAreaInSquareMeters;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
