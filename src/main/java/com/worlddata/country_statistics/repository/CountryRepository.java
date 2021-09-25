package com.worlddata.country_statistics.repository;

import org.springframework.data.repository.CrudRepository;
import com.worlddata.country_statistics.entities.Country;

import java.util.List;

public interface CountryRepository extends CrudRepository<Country, Integer> {
    List<Country> findByName(String name);
    List<Country> findAllByOrderByPopulationDesc();
    List<Country> findAllByOrderByHappinessIndexDesc();
    List<Country> findAllByOrderByGDPDesc();
    List<Country> findAllByOrderByCrimeIndexAsc();
}
