package co.hibernateproject;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class CriteriaQueryTest {

	public static void main(String[] args) throws Exception{
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session s = sf.openSession();
		
		 Criteria c = s.createCriteria(Student.class);
		 c.setMaxResults(10);
		 c.addOrder(Order.desc("sid"));
		 c.add(Restrictions.ilike("sname", "A%"));//like-case sensitive, ilike-insensitive
		 c.add(Restrictions.between("sid", 102, new Integer(108)));// we can give either 102 or new Integer(102)
		 List<co.hibernateproject.Student> stlist = c.list();
			
			for(Student st : stlist){
				System.out.println(st);
				Thread.sleep(500);
			}
			s.close();
			sf.close();

	}

}
