package com.springrest.springrest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.springrest.springrest.entities.Contact;
import com.springrest.springrest.services.ContactServices;

@RestController
public class MyController {
	@Autowired
	private ContactServices contantService;
	@GetMapping("/home")
	public String home() {
		return "welcome to home";
	}
	//get the courses
	@GetMapping("/contact")
	public List<Contact> getContact()
	{
		return this.contantService.getContact();
	}
	
	@GetMapping("/contact/{contactId}")
	public Contact getSingleContact(@PathVariable String contactId)
	{
		return this.contantService.getSingleContact(contactId);
	}
	
	@PostMapping("/contact")
	public Contact addContact(@RequestBody Contact contact) {
		return this.contantService.addContact(contact);
		
	}
	
	@PutMapping("/contact")
	public Contact updateContact(@RequestBody Contact contact) {
		return this.contantService.updateContact(contact);
		
	}
	
	@DeleteMapping("/contact/{contactId}")
	public ResponseEntity<HttpStatus>deleteCourse(@PathVariable String contactId){
		try {
			this.contantService.deleteContact(contactId);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
