package com.partners.allianz.cityhallco2levels.domain.services;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Setter
@Getter
@ToString
@EqualsAndHashCode
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



}
