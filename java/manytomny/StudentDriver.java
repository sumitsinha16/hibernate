package manytomny;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.*;

public class StudentDriver {
	public static void main(String[] args) {
		
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");  
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Student s1 = new Student();
	s1.setName("sumit");
	s1.setAge(22);
	s1.setYop(2022);
	
	Student s2 = new Student();
	s2.setName("kailash");
	s2.setAge(23);
	s2.setYop(2022);
	
	Course c1=new Course();
	c1.setDuration("3");
	c1.setName("java");
	
	Course c2=new Course();
	c2.setDuration("3");
	c2.setName("Python");
	
	List<Student> student=new ArrayList<Student>();
	student.add(s2);
	student.add(s1);
	
	List<Course> courses=new ArrayList<Course>();
	courses.add(c1);
	courses.add(c2);
	
	s1.setCourses(courses);
	s2.setCourses(courses);
	
	c1.setStudent(student);
	c2.setStudent(student);
	
	
}
}