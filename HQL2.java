package co.hibernateproject;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HQL2 {//using Positional Parameters

	public static void main(String[] args) throws Exception {
		SessionFactory sf =HibernateUtils.getSessionFactory();
		Session s = sf.openSession();
		
		String hql = "from co.hibernateproject.Student where sid between ? and ?";//searches between 0(first), 1(second),2...
		Query q = s.createQuery(hql);
		
		q.setInteger(0, 102);
		q.setInteger(1, 106);
		List<co.hibernateproject.Student> stlist = q.list();
		
		for(Student st : stlist){
			System.out.println(st);
			Thread.sleep(1000);
		}
		s.close();
		sf.close();
	}

}
