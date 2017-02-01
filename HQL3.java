package co.hibernateproject;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HQL3 {
	public static void main(String[] args)throws Exception{//using Named Parameters
	SessionFactory sf =HibernateUtils.getSessionFactory();
	Session s = sf.openSession();
	
	String hql = "from co.hibernateproject.Student where sid between :min and :max";
	Query q = s.createQuery(hql);

	q.setInteger("min", 102);
	q.setInteger("max", 104);
	List<co.hibernateproject.Student> stlist = q.list();
	
	for(Student st : stlist){
		System.out.println(st);
		Thread.sleep(1000);
	}
	s.close();
	sf.close();
}
}


