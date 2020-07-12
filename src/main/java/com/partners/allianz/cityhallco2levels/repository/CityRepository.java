package com.partners.allianz.cityhallco2levels.repository;

import com.partners.allianz.cityhallco2levels.domain.services.CarbonSensor;
import com.partners.allianz.cityhallco2levels.domain.services.City;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<City,Long> {
}
