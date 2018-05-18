package com.takarekinfoapp.takarekinfo.controller;

import com.takarekinfoapp.takarekinfo.model.NewRealEstate;
import com.takarekinfoapp.takarekinfo.model.RealEstate;
import com.takarekinfoapp.takarekinfo.service.RealEstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class RealEstateController {

    @Autowired RealEstateService realEstateService;

    @PostMapping("/realestate/new")
    public int getClosestRealEstatePrice(@RequestBody NewRealEstate newRealEstate) {
        RealEstate realEstate = realEstateService.getClosestRealEstate(newRealEstate);
        realEstateService.createNew
        return realEstate.getPricePerSquareMeterInHUF() * newRealEstate.getBaseAreaInSquareMeters();
    }


}
