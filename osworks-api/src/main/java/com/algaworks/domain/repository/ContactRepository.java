package com.algaworks.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.osworks.domain.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
