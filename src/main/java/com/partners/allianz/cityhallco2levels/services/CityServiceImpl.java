package com.partners.allianz.cityhallco2levels.services;

import com.partners.allianz.cityhallco2levels.domain.services.City;
import com.partners.allianz.cityhallco2levels.repository.CityRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Implementation of  City service .
 */
@Service
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public City saveCity(City city) {
        return cityRepository.save(city);
    }

    @Override
    public Optional<City> getCityById(Long id) {
        return cityRepository.findById(id);
    }

    @Override
    public City updateCity(City city) {
        return cityRepository.save(city);
    }

    @Override
    public void deleteCityById(Long id) {
        cityRepository.deleteById(id);
    }

    @Override
    public void deleteAllCities() {
        cityRepository.deleteAll();

    }


}
