package com.habngroup.springboot_kaddem.controllers;

import com.habngroup.springboot_kaddem.entities.Professor;
import com.habngroup.springboot_kaddem.services.ProfessorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ProfessorController  {
    private ProfessorService professorService;
    @PostMapping("addProfessor")
    public void addProfessor(Professor professor) {
        professorService.addProfessor(professor);
    }

    @PutMapping("updateProfessor")
    public void updateProfessor( Professor professor) {
        professorService.updateProfessor(professor);
    }

    @DeleteMapping("deleteProfessor")
    public void deleteProfessor(Professor professor) {
        professorService.deleteProfessor(professor);
    }

    
    public void deleteProfessorById(Long professorId) {

    }

    @GetMapping("getProfessors")
    public List<Professor> getAllProfessors() {
        return   professorService.getAllProfessors();
    }

    @GetMapping("getProfessorById")
    public Professor getProfessorById(Long professorId) {
        return professorService.getProfessorById(professorId);
    }

    
    public void assignProfessorToDepartement(Long professorId, Long departementId) {

    }

    
    public Professor addAndAssignProfessorToEquipeAndContract(Professor Professor, Long idContrat, Long idEquipe) {
        return null;
    }

    
    public List<Professor> getProfessorsByDepartement(Long idDepartement) {
        return null;
    }
}
