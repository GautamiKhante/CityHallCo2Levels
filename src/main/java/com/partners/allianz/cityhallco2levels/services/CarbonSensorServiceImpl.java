package com.partners.allianz.cityhallco2levels.services;

import com.partners.allianz.cityhallco2levels.domain.services.CarbonSensor;
import com.partners.allianz.cityhallco2levels.repository.CarbonSensorRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Implementation of Carbon service interface.
 */
@Service
public class CarbonSensorServiceImpl implements CarbonSensorService {
    private final CarbonSensorRepository carbonSensorRepository;

    public CarbonSensorServiceImpl(CarbonSensorRepository carbonSensorRepository) {
        this.carbonSensorRepository = carbonSensorRepository;
    }

    @Override
    public CarbonSensor saveSensor(CarbonSensor carbonSensor) {
        return carbonSensorRepository.save(carbonSensor);
    }

    @Override
    public Optional<CarbonSensor> getCarbonSensorById(Long id) {
        return carbonSensorRepository.findById(id);
    }

    @Override
    public CarbonSensor updateCarbonSensor(CarbonSensor carbonSensor) {
        return carbonSensorRepository.save(carbonSensor);
    }

    @Override
    public void findAllCarbonSensor() {
        carbonSensorRepository.findAll();
    }

    @Override
    public void deleteCarbonSensorById(Long id) {
        carbonSensorRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        carbonSensorRepository.deleteAll();
    }
}
