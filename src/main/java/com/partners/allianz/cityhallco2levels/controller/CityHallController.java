package com.partners.allianz.cityhallco2levels.controller;

import com.partners.allianz.cityhallco2levels.domain.services.CarbonSensor;
import com.partners.allianz.cityhallco2levels.domain.services.City;
import com.partners.allianz.cityhallco2levels.domain.services.District;
import com.partners.allianz.cityhallco2levels.services.CityHallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CityHallController {

    @Autowired
    CityHallService cityHallService;



    @GetMapping("/carbon")
    public Iterable<CarbonSensor> getCarbonLevels(){
        return cityHallService.getAllCarbonDetail();
    }

    @PutMapping("/addCarbon")
    public CarbonSensor saveCarbonLevels(@RequestBody CarbonSensor carbonSensor){
        return cityHallService.saveCarbonLevel(carbonSensor);
    }

    @PutMapping("/addDistrict")
    public District saveDistrict(@RequestBody District district){
        return cityHallService.saveDistrict(district);
    }
    @PutMapping("/addCity")
    public City saveCity(@RequestBody City city ){
        return cityHallService.saveCity(city);
    }


}
