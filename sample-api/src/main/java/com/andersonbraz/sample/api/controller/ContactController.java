package com.andersonbraz.sample.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andersonbraz.sample.domain.model.Contact;
import com.andersonbraz.sample.domain.repository.ContactRepository;

@RestController
@RequestMapping("contacts")
public class ContactController {
	
	@Autowired
	private ContactRepository contactRepository;
	
	@GetMapping
	public List<Contact> listar(){
		return contactRepository.findAll();
	}
	
	@GetMapping("/{contactId}")
	public Contact buscar(@PathVariable Integer contactId){
		Optional<Contact> contact = contactRepository.findById(contactId);
		return contact.orElse(null);
	}
	
}
