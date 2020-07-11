package com.partners.allianz.cityhallco2levels.domain.services;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
@Entity
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String districtName;
    private String carbonLevels;


    @ManyToOne
    private City city;

    @ManyToMany
    @JoinTable(name = "city_district", joinColumns = @JoinColumn(name = "district_id"),
            inverseJoinColumns = @JoinColumn(name = "city_id"))
    private Set<CarbonSensor> sensors =new HashSet<>();

    public District() {

    }

    public District(String carbonLevels, String districtName) {
        this.carbonLevels = carbonLevels;
        this.districtName = districtName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getCarbonLevels() {
        return carbonLevels;
    }

    public void setCarbonLevels(String carbonLevels) {
        this.carbonLevels = carbonLevels;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Set<CarbonSensor> getSensors() {
        return sensors;
    }

    public void setSensors(Set<CarbonSensor> sensors) {
        this.sensors = sensors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return Objects.equals(id, district.id) &&
                Objects.equals(districtName, district.districtName) &&
                Objects.equals(carbonLevels, district.carbonLevels) &&
                Objects.equals(city, district.city) &&
                Objects.equals(sensors, district.sensors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, districtName, carbonLevels, city, sensors);
    }

    @Override
    public String toString() {
        return "District{" +
                "id=" + id +
                ", districtName='" + districtName + '\'' +
                ", carbonLevels='" + carbonLevels + '\'' +
                ", city=" + city +
                ", sensors=" + sensors +
                '}';
    }
}
