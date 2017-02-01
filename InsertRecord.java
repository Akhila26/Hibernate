package co.hibernateproject;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class InsertRecord {

	public static void main(String[] args) {
	SessionFactory sf = HibernateUtils.getSessionFactory();
	Session session = sf.openSession();
	Transaction t = session.beginTransaction();
	
	//user input
	Scanner sc = new Scanner(System.in);
	String req = "y";
	while(req.equalsIgnoreCase("y")){
	System.out.println("Enter sid,sname,email");
	int sid = sc.nextInt();
	String sname = sc.next();
	String email = sc.next();
	
	Student st = new Student (sid,sname,email);
	session.save(st);
	
	System.out.println("Do you want to add more students?");
	req =sc.next();
	}
	
	System.out.println("****************");
	System.out.println("Creating SQL queries...");
	System.out.println("****************");
	
	
	//program input
	
	/*Student st = new Student(103,"Sai","akhila@gmail.com");
	session.save(st);
	*/
	
	t.commit();
	System.out.println("Student saved!");
	
	sc.close();
	session.close(); 
	sf.close();
	
	}

}
