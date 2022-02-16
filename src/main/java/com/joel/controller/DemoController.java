package com.joel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.joel.model.Persona;
import com.joel.repository.PersonaRepository;

@Controller
public class DemoController {
	
	@Autowired
	private PersonaRepository personaRepository;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
		Persona entity = new Persona();
		entity.setIdPersona(2);
		entity.setNombre("Gabo");
		personaRepository.save(entity);
		
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping("/listar")
	public String listar(Model model) {
		//logica
		
		model.addAttribute("personas", personaRepository.findAll());
		return "greeting";
	}
	
}
