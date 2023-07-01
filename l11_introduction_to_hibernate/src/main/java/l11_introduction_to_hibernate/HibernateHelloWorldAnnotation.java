package l11_introduction_to_hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateHelloWorldAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration c = new Configuration();
		
		SessionFactory sf = c.configure("hbm-annotation.cfg.xml").buildSessionFactory();
		
		System.out.println(sf);
		
		Session session = sf.openSession();
		System.out.println("Session started"+session);
		
		EmployeeAnnotation e = new EmployeeAnnotation(0, "John", 2000);
		
		
		session.save(e);
		
		session.close();
		
	}

}
