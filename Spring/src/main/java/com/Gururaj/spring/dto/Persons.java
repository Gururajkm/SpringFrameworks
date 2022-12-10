package com.Gururaj.spring.dto;

public class Persons {
	
	
	private int id;
	private String name;
	private String email;
	
	Persons(int id,String name, String email){
		System.out.println("Invoking parameterized Constructor");
		this.id=id;
		this.name=name;
		this.email=email;
		
		
	}
	
	public int getInt() {
		return id;
	}

	public void setName(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this. email =  email;
	}

	



}
