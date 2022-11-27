package com.habngroup.springboot_kaddem.services;

import com.habngroup.springboot_kaddem.entities.Professor;

import java.util.List;

public interface IProfessor {
    void addProfessor(Professor professor);
    void updateProfessor( Professor professor);
    void deleteProfessor(Professor professor);
    void deleteProfessorById(Long professorId);
    List<Professor> getAllProfessors();

    Professor getProfessorById(Long professorId);
    void assignProfessorToDepartement (Long professorId, Long departementId) ;
    Professor addAndAssignProfessorToEquipeAndContract(Professor Professor, Long idContrat, Long idEquipe);
    List<Professor> getProfessorsByDepartement (Long idDepartement);
}
