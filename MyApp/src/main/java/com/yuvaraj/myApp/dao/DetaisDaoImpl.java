package com.yuvaraj.myApp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.yuvaraj.myApp.entity.MyAppRegistrationDetails;


@Repository
public class DetaisDaoImpl implements DetailsDao {
	

	private SessionFactory factory;
	
public void  setFactory( SessionFactory factory) {
	this.factory=factory;
	
	
	public void save(MyAppRegistrationDetails details) { 
		Session session= factory.openSession(); 
		Transaction transaction=session.beginTransaction();
	    session.save(details);
        transaction.commit();
		session.close();
}
	
	
	}
	
	
}

