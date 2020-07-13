package com.partners.allianz.cityhallco2levels.controller;

import com.partners.allianz.cityhallco2levels.domain.services.District;
import com.partners.allianz.cityhallco2levels.services.DistrictService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * District controller for the CRUD operations on districts.
 */
@RestController
@RequestMapping("/district")
public class DistrictController {

    private final DistrictService districtService;

    public DistrictController(DistrictService districtService) {
        this.districtService = districtService;
    }

    @PostMapping("/newDistrict")
    public District addDistrict(@RequestBody District district) {
        return districtService.saveDistrict(district);
    }

    @PutMapping("/updateMapping")
    public District updateDistrict(@RequestBody District district) {
        return districtService.updateDistrict(district);
    }

    @GetMapping("{/id}")
    public Optional<District> getDistrict(@PathVariable Long id) {
        return districtService.getDistrictById(id);
    }

    @DeleteMapping("{/id}")
    public void deleteDistrict(@PathVariable Long id) {
        districtService.getDistrictById(id);
    }

}
