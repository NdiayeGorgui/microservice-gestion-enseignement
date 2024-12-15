package com.srv.etudemicroserviceetudiantservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.srv.etudemicroserviceetudiantservice.entities.Cours;

@FeignClient(name="COURS-SERVICE")
public interface CoursService {
	@GetMapping("cours/{id}")
 public Cours getCoursById(@PathVariable(name="id") Long id);
}

