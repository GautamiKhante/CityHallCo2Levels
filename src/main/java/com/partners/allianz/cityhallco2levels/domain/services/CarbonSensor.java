package com.partners.allianz.cityhallco2levels.domain.services;

import javax.persistence.*;

/**
 * POJO class for Carbon sensor.
 */

@Entity
public class CarbonSensor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String location;
    private String sensorData;
    @ManyToOne
    private District districts;

    /**
     * Constructor
     */

    public CarbonSensor() {
    }

    /**
     * Constructor
     */

    public CarbonSensor(String location, String sensorData) {
        this.location = location;
        this.sensorData = sensorData;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSensorData() {
        return sensorData;
    }

    public void setSensorData(String sensorData) {
        this.sensorData = sensorData;
    }

    public District getDistricts() {
        return districts;
    }

    public void setDistricts(District districts) {
        this.districts = districts;
    }
}
