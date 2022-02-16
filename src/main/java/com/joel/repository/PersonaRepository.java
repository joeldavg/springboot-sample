package com.joel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joel.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {
	
}
