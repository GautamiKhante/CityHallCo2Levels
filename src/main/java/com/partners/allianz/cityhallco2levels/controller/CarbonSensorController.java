package com.partners.allianz.cityhallco2levels.controller;

import com.partners.allianz.cityhallco2levels.domain.services.CarbonSensor;
import com.partners.allianz.cityhallco2levels.domain.services.District;
import com.partners.allianz.cityhallco2levels.services.CarbonSensorService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/sensor")
public class CarbonSensorController {

    private final CarbonSensorService carbonSensorService;


    public CarbonSensorController(CarbonSensorService carbonSensorService) {
        this.carbonSensorService = carbonSensorService;
    }

    @PostMapping("/newSensor")
    public CarbonSensor addCarbonSensor(@RequestBody CarbonSensor carbonSensor) {
        return carbonSensorService.saveSensor(carbonSensor);
    }

    @PutMapping("/updateSensor")
    public CarbonSensor updateCarbonSensor(@RequestBody CarbonSensor carbonSensor) {
        return carbonSensorService.updateCarbonSensor(carbonSensor);
    }

    @GetMapping("{/id}")
    public Optional<CarbonSensor> getCarbonSensor(@PathVariable Long id) {
        return carbonSensorService.getCarbonSensorById(id);
    }

    @DeleteMapping("{/id}")
    public void deleteCarbonSensor(@PathVariable Long id) {
        carbonSensorService.deleteCarbonSensorById(id);
    }
}
