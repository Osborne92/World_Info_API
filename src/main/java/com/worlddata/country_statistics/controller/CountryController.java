package com.worlddata.country_statistics.controller;

import java.lang.Iterable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestParam;

import com.worlddata.country_statistics.entities.Country;
import com.worlddata.country_statistics.repository.CountryRepository;

@RestController
public class CountryController {
    private final CountryRepository countryRepository;

    public CountryController(final CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @GetMapping("/countries")
    public Iterable<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @GetMapping("/countries/{id}")
    public Optional<Country> getCountryById(@PathVariable("id") Integer id) {
        return this.countryRepository.findById(id);
    }

    @GetMapping("/countries/name/{name}")
    public List<Country> getCountryByName(@PathVariable("name") String name) {
        return this.countryRepository.findByName(name);
    }

    @GetMapping("/countries/population")
    public Iterable<Country> getCountriesByPopulation() {
        return this.countryRepository.findAllByOrderByPopulationDesc();
    }

    @GetMapping("/countries/happiness")
    public Iterable<Country> getCountriesByHappiness() {
        return this.countryRepository.findAllByOrderByHappinessIndexDesc();
    }

    @GetMapping("/countries/gdp")
    public Iterable<Country> getCountriesByGdp() {
        return this.countryRepository.findAllByOrderByGDPDesc();
    }

    @GetMapping("/countries/crime")
    public Iterable<Country> getCountriesByCrimeIndex() {
        return this.countryRepository.findAllByOrderByCrimeIndexAsc();
    }

    @PostMapping("/countries")
    public Country createNewCountry(@RequestBody Country country) {
        Country newCountry = this.countryRepository.save(country);
        return newCountry;
    }

    @PutMapping("/countries/{id}")
    public Country updateCountry(@PathVariable("id") Integer id, @RequestBody Country c) {
        Optional<Country> countryToUpdateOptional = this.countryRepository.findById(id);
        if (!countryToUpdateOptional.isPresent()) {
            return null;
        }
        Country countryToUpdate = countryToUpdateOptional.get();

        if (c.getName() != null) {
            countryToUpdate.setName(c.getName());
        }

        if (c.getPopulation() != null) {
            countryToUpdate.setPopulation(c.getPopulation());
        }

        if (c.getHappinessIndex() != null) {
            countryToUpdate.setHappinessIndex(c.getHappinessIndex());
        }

        if (c.getGDP() != null) {
            countryToUpdate.setGDP(c.getGDP());
        }

        if (c.getCrimeIndex() != null) {
            countryToUpdate.setCrimeIndex(c.getCrimeIndex());
        }

        Country updateCountry = this.countryRepository.save(countryToUpdate);
        return updateCountry;
    }

    @DeleteMapping("/countries/{id}")
    public Country deleteCountry(@PathVariable("id") Integer id) {
        Optional<Country> countryToDeleteOption = this.countryRepository.findById(id);

        if(!countryToDeleteOption.isPresent()) {
            return null;
        }
        Country countryToDelete = countryToDeleteOption.get();
        this.countryRepository.delete(countryToDelete);
        return countryToDelete;
    }
}
