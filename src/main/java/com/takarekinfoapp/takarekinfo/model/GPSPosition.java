package com.takarekinfoapp.takarekinfo.model;

import javax.persistence.*;

@Entity
public class GPSPosition {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private double longitude;

    private double latitude;

    @OneToOne
    @JoinColumn(name = "realEstate_id")
    private RealEstate realEstate;

    @OneToOne
    @JoinColumn(name = "calculation_id")
    private Calculation calculation;

    public GPSPosition() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public RealEstate getRealEstate() {
        return realEstate;
    }

    public void setRealEstate(RealEstate realEstate) {
        this.realEstate = realEstate;
    }

    public Calculation getCalculation() {
        return calculation;
    }

    public void setCalculation(Calculation calculation) {
        this.calculation = calculation;
    }
}
