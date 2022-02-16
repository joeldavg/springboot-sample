package com.joel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joel.model.Persona;
import com.joel.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	public Usuario findByNombre(String nombre);
	
}
