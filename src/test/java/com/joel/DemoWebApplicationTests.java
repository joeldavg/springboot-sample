package com.joel;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.joel.model.Usuario;
import com.joel.repository.UsuarioRepository;

@SpringBootTest
class DemoWebApplicationTests {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Test
	void crearUsuarioTest() {
		
		Usuario us = new Usuario();
		
		us.setId(4);
		us.setNombre("codex");
		us.setClave(encoder.encode("123"));
		
		Usuario retorno = usuarioRepository.save(us);
		
		assertTrue(retorno.getClave().equalsIgnoreCase(us.getClave()));
	}

}
