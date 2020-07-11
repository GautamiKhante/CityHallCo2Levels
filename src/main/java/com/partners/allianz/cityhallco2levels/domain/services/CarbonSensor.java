package com.partners.allianz.cityhallco2levels.domain.services;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
@Entity
public class CarbonSensor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String location;

    @ManyToMany(mappedBy = "sensors")
    private Set<District> districts = new HashSet<>();

    public CarbonSensor() {
    }

    public CarbonSensor(String location) {
        this.location = location;

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

    public Set<District> getDistricts() {
        return districts;
    }

    public void setDistricts(Set<District> districts) {
        this.districts = districts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarbonSensor that = (CarbonSensor) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(location, that.location) &&
                Objects.equals(districts, that.districts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, location, districts);
    }

    @Override
    public String toString() {
        return "CarbonSensor{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", districts=" + districts +
                '}';
    }
}
