package loginvalidation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.query.Query;

public class FetchAllData {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		javax.persistence.Query query=em.createQuery("select u from u");
		List<user> users=query.getResult();
		for(User iser:users) {
			System.out.println(user.getId());
			System.out.println(user.getname());
			System.out.println(user.getEmail());
			System.out.println(user.getPassword());
			System.out.println("------------------------");
		}
	}

}
