package com.partners.allianz.cityhallco2levels.domain.services;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String CityName;

    @OneToMany
    @JoinColumn(name = "city_id")
    private Set<District> districts = new HashSet<>();

    public City() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
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
        City city = (City) o;
        return Objects.equals(id, city.id) &&
                Objects.equals(CityName, city.CityName) &&
                Objects.equals(districts, city.districts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, CityName, districts);
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", CityName='" + CityName + '\'' +
                ", districts=" + districts +
                '}';
    }
}
