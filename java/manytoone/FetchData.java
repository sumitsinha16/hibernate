package manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchData {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");  
		EntityManager em=emf.createEntityManager();
		Branch b1 = em.find(Branch.class, 1);
		System.out.println("branch-details");
		System.out.println(b1.getAddress());
		System.out.println(b1.getManager());
		System.out.println(b1.getId());
		System.out.println("hospital details");
		Hospital h1=b1.getHospital();
		System.out.println(h1.getCeo());
		System.out.println(h1.getId());
		System.out.println(h1.getName());
	}

}
