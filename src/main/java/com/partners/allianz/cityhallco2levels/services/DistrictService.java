package com.partners.allianz.cityhallco2levels.services;

import com.partners.allianz.cityhallco2levels.domain.services.City;
import com.partners.allianz.cityhallco2levels.domain.services.District;

import java.util.Optional;

/**
 * Interface for the operation on Districts.
 */
public interface DistrictService {

    District saveDistrict(District district);

    Optional<District> getDistrictById(Long id);

    District updateDistrict(District district);

    void findAllDistrict();

    void deleteByIda(Long id);

    void deleteAll();


}
