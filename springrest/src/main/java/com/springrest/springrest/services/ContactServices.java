package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Contact;

public interface ContactServices {
	public List<Contact> getContact();
	public Contact addContact(Contact contact);
	public Contact updateContact(Contact contact);
}
