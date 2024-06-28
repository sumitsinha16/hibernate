package com.jsp.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class AadharDriver {
public static void main(String[] args) {
	

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");  
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Citizen c1=new Citizen();
	
	c1.setId(1);
	c1.setName("sumit");
	c1.setAge(22);
	
	Aadhar a1=new Aadhar();
	
	a1.setId(1);
	a1.setAadharNumber( 12345667890L);
	a1.setAddress("bangalore");
	
	c1.setAadhar(a1);
	a1.setCitizen(c1);
	
	et.begin();
	em.persist(c1);
	em.persist(a1);
	et.commit();
}
}