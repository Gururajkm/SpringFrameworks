package com.Gururaj.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Gururaj.spring.dto.Persons;

public class Container {
	public static void main(String[] args) {
		
		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory factory= new XmlBeanFactory(resource);
	
		Persons persons=(Persons)factory.getBean("yuvaraj");
		System.out.println(persons.getName());
		System.out.println(persons.getEmail());
		
	}

}
