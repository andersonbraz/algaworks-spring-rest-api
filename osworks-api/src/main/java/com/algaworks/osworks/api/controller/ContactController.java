package com.algaworks.osworks.api.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Contact;

@RestController
public class ContactController {

	@PersistenceContext
	private EntityManager manager;

	@GetMapping("/contacts")
	public List<Contact> listar() {
		return manager.createQuery("from Contact", Contact.class)
				.getResultList();
	}

}
