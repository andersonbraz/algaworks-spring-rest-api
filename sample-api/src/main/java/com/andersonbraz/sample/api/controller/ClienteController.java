package com.andersonbraz.sample.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andersonbraz.sample.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/test")
	public String test() {
		return "Test";
	}
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		Cliente c1 =  new Cliente();
		Cliente c2 =  new Cliente();
		Cliente c3 =  new Cliente();
		
		c1.setId(1L);
		c1.setNome("Anderson");
		c1.setTelefone("(99)99999-9999");
		c1.setEmail("contato@andersonbraz.com");
		
		c2.setId(2L);
		c2.setNome("João");
		c2.setTelefone("(88)88888-8888");
		c2.setEmail("joao@andersonbraz.com");
		
		c3.setId(3L);
		c3.setNome("Gustavo");
		c3.setTelefone("(77)77777-7777");
		c3.setEmail("gustavo@andersonbraz.com");
		
		return Arrays.asList(c1, c2, c3);
		
	}
}
