package com.srv.etudemicroserviceetudiantservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srv.etudemicroserviceetudiantservice.entities.Cours;
import com.srv.etudemicroserviceetudiantservice.entities.Etudiant;
import com.srv.etudemicroserviceetudiantservice.repository.EtudiantRepository;

@Service
public class EtudiantService {

	@Autowired
	EtudiantRepository etudiantRepository;
	@Autowired
	CoursService coursService;

	public Optional<Etudiant> getEtudiant(final Long id) {
		Etudiant etudiant= etudiantRepository.findById(id).get();
		
		Cours cours=coursService.getCoursById(etudiant.getIdCours());
	    etudiant.setCours(cours);
		return Optional.of(etudiant);
	}

	public List<Etudiant> getEtudiants() {
		List<Etudiant> etudiants=etudiantRepository.findAll();
		etudiants.forEach(x->{
			x.setCours(coursService.getCoursById(x.getIdCours()));
		});
		
		return etudiants;
	}

	public void deleteEtudiant(final Long id) {
		etudiantRepository.deleteById(id);
	}

	public Etudiant saveEtudiant(Etudiant etudiant) {
		
		Cours cours=coursService.getCoursById(etudiant.getIdCours());
	    etudiant.setCours(cours);

		Etudiant savedEtudiant = etudiantRepository.save(etudiant);
		return savedEtudiant;
	}

}
