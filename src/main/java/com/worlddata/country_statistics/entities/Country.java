package com.worlddata.country_statistics.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "COUNTRIES")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "POPULATION")
    private Integer population;

    @Column(name = "HAPPINESS_INDEX")
    private Integer happinessIndex;

    @Column(name = "GDP_PER_CAPITA")
    private Integer GDP;

    @Column(name = "CRIME_INDEX")
    private Integer crimeIndex;

    public Integer getId() {
        return this.id;
    }

    public void setId() {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopulation() {
        return this.population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Integer getHappinessIndex() {
        return this.happinessIndex;
    }

    public void setHappinessIndex(Integer happinessIndex) {
        this.happinessIndex = happinessIndex;
    }

    public Integer getGDP() {
        return this.GDP;
    }

    public void setGDP(Integer GDP) {
        this.GDP = GDP;
    }

    public Integer getCrimeIndex() {
        return this.crimeIndex;
    }

    public void setCrimeIndex(Integer crimeIndex) {
        this.crimeIndex = crimeIndex;
    }

}
