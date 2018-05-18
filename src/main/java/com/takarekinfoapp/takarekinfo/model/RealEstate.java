package com.takarekinfoapp.takarekinfo.model;


import javax.persistence.*;

@Entity
public class RealEstate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "realEstate_id")
    private Long id;

    @OneToOne(mappedBy = "realEstate",
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private GPSPosition GPSPosition;

    private int pricePerSquareMeterInHUF;

    public RealEstate() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GPSPosition getGPSPosition() {
        return GPSPosition;
    }

    public void setGPSPosition(GPSPosition GPSPosition) {
        this.GPSPosition = GPSPosition;
    }

    public int getPricePerSquareMeterInHUF() {
        return pricePerSquareMeterInHUF;
    }

    public void setPricePerSquareMeterInHUF(int pricePerSquareMeterInHUF) {
        this.pricePerSquareMeterInHUF = pricePerSquareMeterInHUF;
    }
}
