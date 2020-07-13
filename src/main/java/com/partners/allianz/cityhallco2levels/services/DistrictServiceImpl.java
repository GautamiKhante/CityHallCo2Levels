package com.partners.allianz.cityhallco2levels.services;

import com.partners.allianz.cityhallco2levels.domain.services.District;
import com.partners.allianz.cityhallco2levels.repository.DistrictRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Implementation of District service.
 */
@Service
public class DistrictServiceImpl implements DistrictService {

     private final DistrictRepository districtRepository;

    public DistrictServiceImpl(DistrictRepository districtRepository) {
        this.districtRepository = districtRepository;
    }

    @Override
    public District saveDistrict(District district) {
        return districtRepository.save(district);
    }

    @Override
    public Optional<District> getDistrictById(Long id) {
        return districtRepository.findById(id);
    }

    @Override
    public District updateDistrict(District district) {
        return districtRepository.save(district);
    }

    @Override
    public void findAllDistrict() {
        districtRepository.findAll();
    }

    @Override
    public void deleteByIda(Long id) {
        districtRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        districtRepository.deleteAll();
    }
}
