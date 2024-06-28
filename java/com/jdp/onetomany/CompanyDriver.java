package com.jdp.onetomany;

import java.util.List;
import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CompanyDriver {

	public static void main(String[] args) {

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");  
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();

		Company c1=new Company();
		c1.setName("Google");
		c1.setCeo("sp");
		
		Employee e1=new Employee();
		e1.setName("sumit");
		e1.setYoe(3);
		e1.setRole("manager");
		
		Employee e2=new Employee();
		e2.setName("B");
		e2.setYoe(1);
		e2.setRole("Intern");
				
		List<Employee> emp=new ArrayList<Employee>();
		
		emp.add(e1);
		emp.add(e2);
		
		c1.setEmployee(emp);
		
		et.begin();
		em.persist(c1);
		em.persist(e1);
		em.persist(e2);
		et.commit();
	}

}
