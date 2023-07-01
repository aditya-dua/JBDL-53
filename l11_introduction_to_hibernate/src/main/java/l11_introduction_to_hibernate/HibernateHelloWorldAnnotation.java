package l11_introduction_to_hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateHelloWorldAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration c = new Configuration();
		
		SessionFactory sf = c.configure("hbm-annotation.cfg.xml").buildSessionFactory();
		
		System.out.println(sf);
		
		Session session = sf.openSession();
		System.out.println("Session started"+session);
		Transaction tx = session.beginTransaction();
		
		EmployeeAnnotation e = new EmployeeAnnotation(0, "John", 2000);
		
		
		session.save(e);
		session.flush();
		
		tx.commit();
		
		Transaction tx1 = session.beginTransaction();
		
		List<EmployeeAnnotation> employees = session.createQuery("from EmployeeAnnotation").list();
		
		for (EmployeeAnnotation object : employees) {
			
			System.out.println(object);
			
		}
		
		tx1.commit();
		
		EmployeeAnnotation empExample = (EmployeeAnnotation) session.get(EmployeeAnnotation.class, 52);
		System.out.println(empExample);
		
		empExample.setName("Updated Name");
		
		session.update(empExample);
		empExample = (EmployeeAnnotation) session.get(EmployeeAnnotation.class, 52);
		System.out.println(empExample);
		
		Transaction tx2 = session.beginTransaction();
		
		session.delete(empExample);
		
		tx2.commit();
		
		session.close();
		
	}

}
