package com.github.esteridias.countries.repositories;

import com.github.esteridias.countries.entities.Country;
import com.github.esteridias.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
