package com.takarekinfoapp.takarekinfo.service;

import com.takarekinfoapp.takarekinfo.model.NewRealEstate;
import com.takarekinfoapp.takarekinfo.model.RealEstate;
import com.takarekinfoapp.takarekinfo.repository.RealEstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RealEstateService {

    @Autowired RealEstateRepository realEstateRepository;

    private double getDistance(double lat1, double lon1, double lat2, double lon2) {
        double theta = lon1 - lon2;
        double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;

        dist = dist * 1.609344;
        return (dist);
    }

    private double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    private double rad2deg(double rad) {
        return (rad * 180.0 / Math.PI);
    }


    public RealEstate getClosestRealEstate(NewRealEstate newRealEstate) {
        List<RealEstate> realEstates = realEstateRepository.findAll();
        RealEstate closestRealEstate = null;
        double smallestDistance = 0d;
        for (RealEstate realEstate : realEstates) {
            double currentDistance = getDistance(newRealEstate.getLatitude(), newRealEstate.getLongitude(), realEstate.getGPSPosition().getLongitude(), realEstate.getGPSPosition().getLatitude());
            if(currentDistance < smallestDistance) {
                smallestDistance = currentDistance;
                closestRealEstate = realEstate;
            }
        }
        return closestRealEstate;
    }
}
