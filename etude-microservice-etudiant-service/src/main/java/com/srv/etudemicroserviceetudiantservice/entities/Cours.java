package com.srv.etudemicroserviceetudiantservice.entities;



import java.util.List;


import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cours {
	private Long id;
	private String libelle;
	 private double nbeHeure;
	// @OneToMany
	 private List<Etudiant> etudiants;
}
