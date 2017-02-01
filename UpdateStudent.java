package co.hibernateproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UpdateStudent {

	public static void main(String[] args) {

			SessionFactory sf = HibernateUtils.getSessionFactory();
			Session s = sf.openSession();
			s.beginTransaction();
			/*
			Student st = new Student(102,"Akhila T","akhila@gmail.com");
			s.update(st);
			*/
			
			//alternately "load/search" for student, and if student!=null then do
			Student st = (Student)s.get(Student.class, new Integer(104));
			System.out.println(st);
			st.setSname("Shamrocksss");//dirty object -- value differs from that of the DB.
			System.out.println(st);
			
			
			s.getTransaction().commit();
			System.out.println("Student updated");
			s.close();
			sf.close();
			
	}

}
