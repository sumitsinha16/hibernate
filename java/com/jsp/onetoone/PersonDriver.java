package com.jsp.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");  
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		 Person p1=new Person();
		 p1.setId(1);
		 p1.setName("A");
		 p1.setAge(20);
		 
		 Person p2=new Person();
		 p1.setId(2);
		 p1.setName("B");
		 p1.setAge(21);
		 
		 Pan pan1=new Pan();
		 pan1.setId(1);
		 pan1.setPanNumber("A123");
		 pan1.setAddress("bangalore");
		 
		 Pan pan2=new Pan();
		 pan1.setId(2);
		 pan1.setPanNumber("B123");
		 pan1.setAddress("bihar");
		 
		 
			 
		 
		 et.begin();
		 em.persist(p1);
		 em.persist(p2);
		 em.persist(pan1);
		 em.persist(pan2);
		 et.commit();
		 System.out.println("helllo world");
	}

}
