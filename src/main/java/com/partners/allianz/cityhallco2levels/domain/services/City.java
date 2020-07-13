package com.partners.allianz.cityhallco2levels.domain.services;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * POJO class for City
 */

@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String cityName;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "city")
    private Set<District> districts = new HashSet<>();

    /**
     * Constructor
     */
    public City() {
    }

    /**
     * Constructor
     */
    public City(String cityName) {
        this.cityName = cityName;

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Set<District> getDistricts() {
        return districts;
    }

    public void setDistricts(Set<District> districts) {
        this.districts = districts;
    }
}
