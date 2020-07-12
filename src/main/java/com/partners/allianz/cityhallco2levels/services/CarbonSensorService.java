package com.partners.allianz.cityhallco2levels.services;

import com.partners.allianz.cityhallco2levels.domain.services.CarbonSensor;
import com.partners.allianz.cityhallco2levels.domain.services.District;

import java.util.Optional;

public interface CarbonSensorService {

    CarbonSensor saveSensor(CarbonSensor carbonSensor);

    Optional<CarbonSensor> getCarbonSensorById(Long id);

    CarbonSensor updateCarbonSensor(CarbonSensor carbonSensor);

    void findAllCarbonSensor();

    void deleteCarbonSensorById(Long id);

    void deleteAll();
}
