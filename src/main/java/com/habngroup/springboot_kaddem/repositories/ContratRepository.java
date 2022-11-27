package com.habngroup.springboot_kaddem.repositories;

import com.habngroup.springboot_kaddem.entities.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratRepository extends JpaRepository<Contrat, Long> {
}
