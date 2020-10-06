package com.algaworks.osworks.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Contact;
import com.algaworks.osworks.domain.repository.ContactRepository;

@RestController
public class ContactController {
	
	@Autowired
	private ContactRepository contactRepository;

	@GetMapping("/contacts")
	public List<Contact> listar() {
		return contactRepository.findAll();
	}

}
