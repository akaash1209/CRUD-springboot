package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.Dao.ContactDao;
import com.springrest.springrest.entities.Contact;
@Service
public class ContactSeriveimpl implements ContactServices{
	@Autowired
	private ContactDao contactDao;
	public ContactSeriveimpl(){
		
		
	}

	@Override
	public List<Contact> getContact() {
		// TODO Auto-generated method stub
		return contactDao.findAll();
	}

	

	@Override
	public Contact addContact(Contact contact) {
		contactDao.save(contact);
		return contact;
	}

	@Override
	public Contact updateContact(Contact contact) {
		contactDao.save(contact);
		return contact;
	}

	
	
	
	
	
	
}
