package com.srv.etudemicroserviceetudiantservice.entities;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Transient;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "etudiants")
public class Etudiant {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 private String firstName;
	 private String lastName;
	 private String adress;
	 private String mail;
	 private String telephone;
	 private String niveau;
	 @Transient
	 private Cours cours;
	 @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	 private Long idCours;
	 
	
}
