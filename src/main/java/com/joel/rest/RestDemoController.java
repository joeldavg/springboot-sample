package com.joel.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joel.model.Persona;
import com.joel.repository.PersonaRepository;

@RestController
@RequestMapping("/personas")
public class RestDemoController {
	
	@Autowired
	PersonaRepository personaRepository;
	
	@GetMapping
	public List<Persona> listar() {
		return personaRepository.findAll();
	}
	
	@PostMapping
	public void insertar(@RequestBody Persona persona) {
		personaRepository.save(persona);
	}
	
	@PutMapping
	public void modificar(@RequestBody Persona persona) {
		personaRepository.save(persona);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable int id) {
		personaRepository.deleteById(id);
	}
}
