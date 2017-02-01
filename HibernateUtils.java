package co.hibernateproject;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
		public static SessionFactory getSessionFactory(){
		Configuration c = new Configuration();
		c.configure();
		StandardServiceRegistryBuilder sb = new StandardServiceRegistryBuilder();
		sb.applySettings(c.getProperties());
		StandardServiceRegistry standardServiceRegistry = sb.build();
		SessionFactory sf = c.buildSessionFactory(standardServiceRegistry);
		return sf;
		}
	

}
