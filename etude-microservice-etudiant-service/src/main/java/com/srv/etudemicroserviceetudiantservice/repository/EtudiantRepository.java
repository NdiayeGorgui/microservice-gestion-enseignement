package com.srv.etudemicroserviceetudiantservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srv.etudemicroserviceetudiantservice.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long>{

}
