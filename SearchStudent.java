package co.hibernateproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SearchStudent {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session s = sf.openSession();
		
		/*Student st = new Student();//transient state
		s.load(st, new Integer (102));//results in errors if non-existing id's are given
		System.out.println(st);*/
		
		Student st = (Student)s.get(Student.class, new Integer(101));//better because it points to null
		System.out.println(st);
		
		s.clear();
		sf.close();
	}

}
