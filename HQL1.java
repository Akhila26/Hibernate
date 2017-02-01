package co.hibernateproject;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HQL1 {

	public static void main(String[] args) throws Exception {
		SessionFactory sf =HibernateUtils.getSessionFactory();
		Session s = sf.openSession();
		
		String hql = "from co.hibernateproject.Student";
		Query q = s.createQuery(hql);
		
		List<co.hibernateproject.Student> stlist = q.list();
		
		for(Student st : stlist){
			System.out.println(st);
			Thread.sleep(1000);
		}
		s.close();
		sf.close();
		
	}

}
