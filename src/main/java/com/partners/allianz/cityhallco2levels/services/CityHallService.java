package com.partners.allianz.cityhallco2levels.services;

import com.partners.allianz.cityhallco2levels.domain.services.CarbonSensor;
import com.partners.allianz.cityhallco2levels.domain.services.City;
import com.partners.allianz.cityhallco2levels.domain.services.District;
import com.partners.allianz.cityhallco2levels.repository.CarbonSensorRepository;
import com.partners.allianz.cityhallco2levels.repository.CityRepository;
import com.partners.allianz.cityhallco2levels.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityHallService {

    private CarbonSensorRepository carbonSensorRepository;
    private CityRepository cityRepository;
    private DistrictRepository districtRepository;

    @Autowired
    public CityHallService(CarbonSensorRepository carbonSensorRepository, CityRepository cityRepository, DistrictRepository districtRepository) {
        this.carbonSensorRepository = carbonSensorRepository;
        this.cityRepository = cityRepository;
        this.districtRepository = districtRepository;
    }


    public Iterable<CarbonSensor> getAllCarbonDetail() {

        final Iterable<CarbonSensor> all = carbonSensorRepository.findAll();

        for (CarbonSensor cs : all) {
            cs.getDistricts();
        }
        return all;
    }

    public void insertIntoTable(){

    }


    public CarbonSensor saveCarbonLevel(CarbonSensor carbonSensor) {
        return carbonSensorRepository.save(carbonSensor);
    }
    public District saveDistrict(District district){
        return districtRepository.save(district);
    }
    public City saveCity(City city){
        return cityRepository.save(city);
    }


}
