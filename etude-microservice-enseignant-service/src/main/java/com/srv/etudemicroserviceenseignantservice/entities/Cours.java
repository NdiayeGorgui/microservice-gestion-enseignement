package com.srv.etudemicroserviceenseignantservice.entities;


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
	private Long enseignantId;
	private Enseignant enseignant;
}
