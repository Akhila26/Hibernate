package co.hibernateproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SecondLevelCache {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session s1 = sf.openSession();
		Session s2 = sf.openSession();
		
		Student st1 = (Student)s1.get(Student.class, new Integer(103));//better because it points to null
		System.out.println(st1);
	
		System.out.println("********");
		
		//different session
		Student st2 = (Student)s2.get(Student.class, new Integer(103));
		//doesn't create query for the second time even though they are two different sessions because Second level caching is used.t hit the DB.
		System.out.println(st2);										
		s1.clear();
		s2.close();
		sf.close();
	}
}
