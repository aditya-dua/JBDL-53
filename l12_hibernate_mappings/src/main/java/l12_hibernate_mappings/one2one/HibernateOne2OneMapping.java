package l12_hibernate_mappings.one2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

// https://github.com/tusharAgarwal2511/hibernate_oneToOne

public class HibernateOne2OneMapping {

	
	public static void main(String[] args) {
		
		Configuration c = new Configuration();
		
		SessionFactory sf = c.configure("hbm.cfg.xml").buildSessionFactory();
		
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
