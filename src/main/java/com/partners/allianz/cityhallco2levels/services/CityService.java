package com.partners.allianz.cityhallco2levels.services;

import com.partners.allianz.cityhallco2levels.domain.services.City;

import java.util.List;
import java.util.Optional;

public interface CityService {

   City saveCity(City city);

   Optional<City> getCityById(Long id);

   City updateCity(City city);

   void deleteCityById(Long id);

   void deleteAllCities();

}
