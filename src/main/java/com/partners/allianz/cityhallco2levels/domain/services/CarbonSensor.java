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
@NoArgsConstructor
@AllArgsConstructor
public class CarbonSensor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String location;
    private String sensorData;

    @ManyToMany(mappedBy = "sensors")
    private Set<District> districts = new HashSet<>();


    /*public CarbonSensor(String location,String sensorData) {
        this.location = location;
        this.sensorData = sensorData;

    }*/


}
