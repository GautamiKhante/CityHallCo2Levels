package com.partners.allianz.cityhallco2levels.repository;

import com.partners.allianz.cityhallco2levels.domain.services.CarbonSensor;
import com.partners.allianz.cityhallco2levels.domain.services.District;
import org.springframework.data.repository.CrudRepository;

public interface DistrictRepository extends CrudRepository<District,Long> {
}
