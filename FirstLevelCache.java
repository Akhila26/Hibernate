package co.hibernateproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class FirstLevelCache { //enabled by default
	
		public static void main(String[] args) {
			SessionFactory sf = HibernateUtils.getSessionFactory();
			Session s = sf.openSession();
			
			Student st1 = (Student)s.get(Student.class, new Integer(103));//better because it points to null
			System.out.println(st1);
		
			System.out.println("********");
			
			Student st2 = (Student)s.get(Student.class, new Integer(103));//doesn't create query for the second time if the same object is requested (or) doesn't hit the DB.
			System.out.println(st2);										//changes will happen in the database only when commit() is given.
			s.clear();
			sf.close();
		}

	}

