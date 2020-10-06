package com.algaworks.osworks.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Contact;
import com.algaworks.osworks.domain.repository.ContactRepository;

@RestController
@RequestMapping("/contacts")
public class ContactController {
	
	@Autowired
	private ContactRepository contactRepository;

	@GetMapping
	public List<Contact> listar() {
		return contactRepository.findAll();
	}
	
	/*
	@GetMapping("/{contactId}")
	public Contact buscar(@PathVariable Long contactId) {
		Optional<Contact> contact = contactRepository.findById(contactId);
		return contact.orElse(null);
	}
	*/
	
	@GetMapping("/{contactId}")
	public ResponseEntity<Contact> buscar(@PathVariable Long contactId) {
		Optional<Contact> contact = contactRepository.findById(contactId);
		
		if(contact.isPresent()) {
			return ResponseEntity.ok(contact.get());
		}
		
		return ResponseEntity.notFound().build();
	}
}
