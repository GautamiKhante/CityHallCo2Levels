package com.partners.allianz.cityhallco2levels.repository;


import com.partners.allianz.cityhallco2levels.domain.services.City;
import org.springframework.data.repository.CrudRepository;

/**
 * Repository for city
 */

public interface CityRepository extends CrudRepository<City,Long> {

    City findByCityName(String cityName);

}
