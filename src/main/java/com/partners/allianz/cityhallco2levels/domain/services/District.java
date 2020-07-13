package com.partners.allianz.cityhallco2levels.domain.services;

import javax.persistence.*;
import java.util.Objects;

/**
 * District POJO class for the district.
 */
@Entity
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String districtName;
    private String carbonLevels;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    /**
     * Constructor
     */
    public District() {
    }

    /**
     * Parameterised Constructor
     */

    public District(String districtName, String carbonLevels, Long id) {
        this.districtName = districtName;
        this.carbonLevels = carbonLevels;
        this.id = id;

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

    /**
     *equals method
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return Objects.equals(id, district.id) &&
                Objects.equals(districtName, district.districtName) &&
                Objects.equals(carbonLevels, district.carbonLevels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, districtName, carbonLevels, city);
    }
}
