package com.andersonbraz.sample.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andersonbraz.sample.domain.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
	

}
