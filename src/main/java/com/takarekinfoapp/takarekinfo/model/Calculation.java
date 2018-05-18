package com.takarekinfoapp.takarekinfo.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
public class Calculation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "calculation_id")
    private Long id;

    @NotEmpty(message = "The calculation's real estate's gps position can not be empty.")
    @OneToOne(mappedBy = "calculation",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    private GPSPosition realEstateGPSPosition;

    @NotEmpty(message = "Square meter can not be empty.")
    private Integer squareMeter;

    @NotEmpty(message = "Price can not be empty.")
    private Integer price;

    public Calculation() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GPSPosition getRealEstateGPSPosition() {
        return realEstateGPSPosition;
    }

    public void setRealEstateGPSPosition(GPSPosition realEstateGPSPosition) {
        this.realEstateGPSPosition = realEstateGPSPosition;
    }

    public Integer getSquareMeter() {
        return squareMeter;
    }

    public void setSquareMeter(Integer squareMeter) {
        this.squareMeter = squareMeter;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
