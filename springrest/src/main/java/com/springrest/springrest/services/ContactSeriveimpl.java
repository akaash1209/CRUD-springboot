package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Contact;
@Service
public class ContactSeriveimpl implements ContactServices{
	List<Contact>list;
	public ContactSeriveimpl(){
		list=new ArrayList<>();
		list.add(new Contact("9924631002","Akash","09akaash"));
		list.add(new Contact("8559544332","ayush","aldjd"));
		
	}

	@Override
	public List<Contact> getContact() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Contact getSingleContact(String contactId) {
		// TODO Auto-generated method stub
		Contact c=null;
		for(Contact getSingleContact:list) {
		if(getSingleContact.getId()==contactId) {
			c=getSingleContact;
			break;
		}
		}
		return c;
	}

	@Override
	public Contact addContact(Contact contact) {
		list.add(contact);
		return contact;
	}

	@Override
	public Contact updateContact(Contact contact) {
		list.forEach(e ->{
			if(e.getId()==contact.getId()) {
				e.setTitle(contact.getTitle());
				e.setDescription(contact.getDescription());
			}
		});
		// TODO Auto-generated method stub
		return contact;
	}

	@Override
	public Contact DeleteContact() {
		list=this.list.stream().collect(Collectors.toList());
		// TODO Auto-generated method stub
		return Contact;
	}
	
	
	
	
	
}
