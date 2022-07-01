package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Contact;

public interface ContactServices {
	public List<Contact> getContact();
	public Contact getSingleContact(String contactId);
	public Contact addContact(Contact contact);
	public Contact updateContact(Contact contact);
	public Contact DeleteContact();
}
