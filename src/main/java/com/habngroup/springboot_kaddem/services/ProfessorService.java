package com.habngroup.springboot_kaddem.services;

import com.habngroup.springboot_kaddem.entities.Professor;
import com.habngroup.springboot_kaddem.repositories.ProfessorRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ProfessorService implements IProfessor{

    ProfessorRepo professorRepo ;
    @Override
    public void addProfessor(Professor professor) {
        professorRepo.save(professor);
    }

    @Override
    public void updateProfessor( Professor professor) {
        professorRepo.save(professor);
    }

    @Override
    public void deleteProfessor(Professor professor) {
        professorRepo.delete(professor);
    }

    @Override
    public void deleteProfessorById(Long professorId) {

    }

    @Override
    public List<Professor> getAllProfessors() {
      return   professorRepo.findAll();
    }

    @Override
    public Professor getProfessorById(Long professorId) {
        return professorRepo.findById(professorId).orElse(null);
    }

    @Override
    public void assignProfessorToDepartement(Long professorId, Long departementId) {

    }

    @Override
    public Professor addAndAssignProfessorToEquipeAndContract(Professor Professor, Long idContrat, Long idEquipe) {
        return null;
    }

    @Override
    public List<Professor> getProfessorsByDepartement(Long idDepartement) {
        return null;
    }
}
