package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente();
		
		c1.setId(1L);
		c1.setNome("Anderson Braz");
		c1.setTelefone("06199998888");
		c1.setEmail("contato@andersonbraz.com");
		
		c2.setId(2L);
		c2.setNome("João Rossi");
		c2.setTelefone("03177776666");
		c2.setEmail("joao@andersonbraz.com");
		
		c3.setId(3L);
		c3.setNome("Gustavo Nery");
		c3.setTelefone("06155554444");
		c3.setEmail("gustavo@andersonbraz.com");
		
		return Arrays.asList(c1, c2, c3);
		
		
	}

}
