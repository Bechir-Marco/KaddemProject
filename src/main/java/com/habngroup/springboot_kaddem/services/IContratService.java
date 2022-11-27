package com.habngroup.springboot_kaddem.services;

import com.habngroup.springboot_kaddem.entities.Contrat;
import java.util.List;

public interface IContratService  {
    void addContrat(Contrat contrat);
    void updateContrat(Long contratId, Contrat contrat);
    void deleteContrat(Contrat contrat);
    void deleteContratById(Long contratId);
    List<Contrat> getAllContrats();
    Contrat getContratById(Long contratId);
    Contrat affectContratToEtudiant(Contrat contrat, String nomEtudiant, String prenomEtudiant);
}
