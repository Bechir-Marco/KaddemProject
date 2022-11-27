package com.habngroup.springboot_kaddem.repositories;

import com.habngroup.springboot_kaddem.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepo extends JpaRepository<Professor, Long> {
}
