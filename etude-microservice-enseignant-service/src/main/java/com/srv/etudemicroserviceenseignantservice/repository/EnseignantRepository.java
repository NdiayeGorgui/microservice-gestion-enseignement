package com.srv.etudemicroserviceenseignantservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srv.etudemicroserviceenseignantservice.entities.Enseignant;

public interface EnseignantRepository extends JpaRepository<Enseignant, Long>{

}
