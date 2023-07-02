package l12_hibernate_mappings.one2oneAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateOne2OneMapping {

	
	public static void main(String[] args) {
		
		Configuration c = new Configuration();
		
		SessionFactory sf = c.configure("hbm-o2o-annotation.cfg.xml").buildSessionFactory();
		
		System.out.println(sf);
		
		Session session = sf.openSession();
		System.out.println("Session started"+session);
		Transaction tx = session.beginTransaction();
		
		CustomerTransaction ctx = new CustomerTransaction();
		
		ctx.setTotal(100);
		
		Customer cx = new Customer();
		cx.setName("Aditya");
		cx.setAddress("Delhi");
		cx.setEmail("aditya@aditya.com");
		
		ctx.setCustomer(cx);
		
		cx.setTransaction(ctx);
		
		session.save(ctx);
		
		session.flush();
		
		tx.commit();
		
	}
}
