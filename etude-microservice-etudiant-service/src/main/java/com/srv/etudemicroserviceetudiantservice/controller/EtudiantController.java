package com.srv.etudemicroserviceetudiantservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.srv.etudemicroserviceetudiantservice.entities.Etudiant;
import com.srv.etudemicroserviceetudiantservice.service.EtudiantService;



@RestController
public class EtudiantController {

	
	@Autowired
	private EtudiantService etudiantService;

	@PostMapping("/etudiants")
	public Etudiant createEtudiantt(@RequestBody Etudiant etudiant) {

		return etudiantService.saveEtudiant(etudiant);
	}

	@GetMapping("/etudiants/{id}")
	public Etudiant getEtudiant(@PathVariable("id") final Long id) {
		Optional<Etudiant> etudiant = etudiantService.getEtudiant(id);
		if (etudiant.isPresent()) {
			return etudiant.get();
		} else {
			return null;
		}
	}

	@GetMapping("/etudiants")
	public List<Etudiant> getEtudiants() {

		List<Etudiant> list = etudiantService.getEtudiants();

		return list;

	}
}
