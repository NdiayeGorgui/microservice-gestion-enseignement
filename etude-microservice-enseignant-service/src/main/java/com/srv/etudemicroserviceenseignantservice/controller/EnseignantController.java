package com.srv.etudemicroserviceenseignantservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.srv.etudemicroserviceenseignantservice.entities.Enseignant;
import com.srv.etudemicroserviceenseignantservice.service.EnseignantService;

@RestController
public class EnseignantController {

	@Autowired
	private EnseignantService enseignantService;

	@PostMapping("/enseignants")
	public Enseignant createEnseignant(@RequestBody Enseignant enseignant) {

		return enseignantService.saveEnseignant(enseignant);
	}

	@GetMapping("/enseignants/{id}")
	public Enseignant getEnseignant(@PathVariable("id") final Long id) {
		Optional<Enseignant> enseignant = enseignantService.getEnseignant(id);
		if (enseignant.isPresent()) {
			return enseignant.get();
		} else {
			return null;
		}
	}

	@GetMapping("/enseignants")
	public List<Enseignant> getEnseignants() {

		List<Enseignant> list = enseignantService.getEnseignants();

		return list;

	}

}
