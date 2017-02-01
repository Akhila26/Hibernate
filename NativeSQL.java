package co.hibernateproject;

import java.util.Scanner;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class NativeSQL {

	public static void main(String[] args)throws Exception {
			SessionFactory sf = HibernateUtils.getSessionFactory();
			Session session = sf.openSession();
			Transaction t = session.beginTransaction();
			
			SQLQuery q = session.createSQLQuery("Select * from Student");
			q.addEntity(Student.class);
			
			
			java.util.List<co.hibernateproject.Student> studs = q.list();
			for(Student st:studs){
				System.out.println(st);
				Thread.sleep(500);
			}
			
			t.commit();
	
			
		
			session.close(); 
			sf.close();
			
	}

}
