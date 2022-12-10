package com.yuvaraj.myApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import  com.yuvaraj.myApp.entity.MyAppRegistrationDetails;

import com.yuvaraj.myApp.dto.Details;

public class HelloController<DetalsDao> {
	@Autowired
	private DetalsDao dao;
	
	@RequestMapping(value="/hello",method=RequestMethod.POST)  
    public String hello(Details details) {
		
		myAppRegistrationDetails regdetails=new myAppRegistrationDetails();
		regdetails.setEmail(Details.getEmail);
		dao.save(regdetails);
		return "Home.jsp";
	}

}
