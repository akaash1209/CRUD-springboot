package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact {
	@Id
	private String id;
	private String title;
	private String description;
	public Contact(String id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", title=" + title + ", description=" + description + "]";
	}
	
}
	