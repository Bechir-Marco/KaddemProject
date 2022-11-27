package com.habngroup.springboot_kaddem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Departement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDepart")
    private Long idDepart;
    private String nomDepart;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "departement")
    @JsonIgnore
    private Set<Etudiant> etudiants;

    @ManyToMany (cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Professor> professorSet;


}
