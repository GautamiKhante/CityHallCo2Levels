package com.partners.allianz.cityhallco2levels.controller;

import com.partners.allianz.cityhallco2levels.repository.DistrictRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarbonDataController {

    private final DistrictRepository districtRepository;

    public CarbonDataController(DistrictRepository districtRepository) {
        this.districtRepository = districtRepository;
    }

    @RequestMapping("/district")
    public String getCarbonData(Model model) {
        model.addAttribute("district", districtRepository.findAll());
        return"district/list";

    }
}
