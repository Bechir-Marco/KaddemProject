package com.habngroup.springboot_kaddem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.models.info.Contact;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Professor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name ="idProfessor")
    private Long idProfessor;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    @ManyToMany (cascade = CascadeType.ALL, mappedBy ="professorSet")
    @JsonIgnore
    private Set<Departement> departementSet;

    @OneToOne (cascade = CascadeType.ALL)
    private Contrat contact;

}
