package com.github.esteridias.staties.repositories;

import com.github.esteridias.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
