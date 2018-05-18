package com.takarekinfoapp.takarekinfo.utils;

import com.takarekinfoapp.takarekinfo.model.Calculation;
import com.takarekinfoapp.takarekinfo.model.GPSPosition;
import com.takarekinfoapp.takarekinfo.model.RealEstate;
import com.takarekinfoapp.takarekinfo.repository.CalculationRepository;
import com.takarekinfoapp.takarekinfo.repository.GPSPositionRepository;
import com.takarekinfoapp.takarekinfo.repository.RealEstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{

    @Autowired CalculationRepository calculationRepository;
    @Autowired GPSPositionRepository gpsPositionRepository;
    @Autowired RealEstateRepository realEstateRepository;

    @Override
    public void run(String... args) throws Exception {

        RealEstate realEstate1 = new RealEstate();
        GPSPosition gpsPosition1 = new GPSPosition();
        realEstateRepository.save(realEstate1);
        gpsPositionRepository.save(gpsPosition1);

        realEstate1.setPricePerSquareMeterInHUF(143232);

        gpsPosition1.setLongitude(19.033471);
        gpsPosition1.setLatitude(47.5085421);
        realEstate1.setGPSPosition(gpsPosition1);

        realEstateRepository.saveAndFlush(realEstate1);





    }
}
