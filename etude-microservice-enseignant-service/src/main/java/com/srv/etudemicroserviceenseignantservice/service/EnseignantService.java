package com.srv.etudemicroserviceenseignantservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srv.etudemicroserviceenseignantservice.entities.Enseignant;
import com.srv.etudemicroserviceenseignantservice.repository.EnseignantRepository;

@Service
public class EnseignantService {
	@Autowired
	EnseignantRepository enseignantRepository;
	
	public Optional<Enseignant> getEnseignant(final Long id) {
        return enseignantRepository.findById(id);
    }

public List<Enseignant> getEnseignants() {
        return enseignantRepository.findAll();
    }

public void deleteEnseignant(final Long id) {
        enseignantRepository.deleteById(id);
    }

public Enseignant saveEnseignant(Enseignant enseignant) {
        Enseignant savedEnseignant = enseignantRepository.save(enseignant);
        return savedEnseignant;
    }

}
