package co.hibernateproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DeleteStudent {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		
		Student st = (Student)s.get(Student.class, new Integer(103));
		if(st!=null){
			System.out.println(st);
			s.delete(st);
		}else{
			System.out.println("No Matching student found!");
		}
		
		
		s.getTransaction().commit();
		s.close();
		sf.close();
	}

}
