package manytoone;

import java.util.List;
import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HospitalDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");  
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Hospital h1=new Hospital();
		h1.setName("appolo Hospital");
		h1.setCeo("Appolo");
		
		Branch b1=new Branch();
		b1.setManager("sumit");
		b1.setAddress("patna");
		
		Branch b2=new Branch();
		b2.setManager("anand");
		b2.setAddress("bangalore");
				
		List<Branch> branches =new ArrayList<Branch>();
		branches.add(b1);
		branches.add(b2);
		
		h1.setBranches(branches);
		b1.setHospital(h1);
		b2.setHospital(h1);
		
		et.begin();
		em.persist(b2);
		em.persist(b1);
		em.persist(h1);
		et.commit();
	}

}
