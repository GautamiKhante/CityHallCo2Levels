package com.partners.allianz.cityhallco2levels.bootstrap;

import com.partners.allianz.cityhallco2levels.domain.services.CarbonSensor;
import com.partners.allianz.cityhallco2levels.domain.services.City;
import com.partners.allianz.cityhallco2levels.domain.services.District;
import com.partners.allianz.cityhallco2levels.repository.CarbonSensorRepository;
import com.partners.allianz.cityhallco2levels.repository.CityRepository;
import com.partners.allianz.cityhallco2levels.repository.DistrictRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final CityRepository cityRepository;
    private final DistrictRepository districtRepository;
    private final CarbonSensorRepository carbonSensorRepository;

    public BootStrapData(CityRepository cityRepository, DistrictRepository districtRepository, CarbonSensorRepository carbonSensorRepository) {
        this.cityRepository = cityRepository;
        this.districtRepository = districtRepository;
        this.carbonSensorRepository = carbonSensorRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        City city = new City("Pune");
        CarbonSensor carbonSensor1 = new CarbonSensor("North", "44Kg");
        District district1 = new District("Shivajinagar", carbonSensor1.getSensorData());
        city.getDistricts().add(district1);
        carbonSensor1.setDistricts(district1);


        CarbonSensor carbonSensor2 = new CarbonSensor("South", "38Kg");
        District district2 = new District("Aundh", carbonSensor2.getSensorData());
        city.getDistricts().add(district2);
        carbonSensor2.setDistricts(district2);

        CarbonSensor carbonSensor3 = new CarbonSensor("East", "49Kg");
        District district3 = new District("Hadapsar", carbonSensor3.getSensorData());
        city.getDistricts().add(district3);
        carbonSensor3.setDistricts(district3);

        CarbonSensor carbonSensor4 = new CarbonSensor("West", "36Kg");
        District district4 = new District("Kharadi", carbonSensor4.getSensorData());
        city.getDistricts().add(district4);
        carbonSensor4.setDistricts(district4);


        district1.setCity(city);
        district2.setCity(city);
        district3.setCity(city);
        district4.setCity(city);

        cityRepository.save(city);

        carbonSensorRepository.save(carbonSensor1);
        carbonSensorRepository.save(carbonSensor2);
        carbonSensorRepository.save(carbonSensor3);
        carbonSensorRepository.save(carbonSensor4);



    }
}
