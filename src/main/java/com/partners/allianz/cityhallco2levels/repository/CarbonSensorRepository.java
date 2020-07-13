package com.partners.allianz.cityhallco2levels.repository;

import com.partners.allianz.cityhallco2levels.domain.services.CarbonSensor;
import org.springframework.data.repository.CrudRepository;

/**
 * repository for Carbon sensors
 */

public interface CarbonSensorRepository extends CrudRepository<CarbonSensor,Long> {
}
