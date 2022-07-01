package com.springrest.springrest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Contact;

public interface ContactDao extends JpaRepository<Contact,String> {

}
