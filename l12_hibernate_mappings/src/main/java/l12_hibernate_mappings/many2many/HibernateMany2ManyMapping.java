package l12_hibernate_mappings.many2many;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMany2ManyMapping {

	
	public static void main(String[] args) {
		
		Configuration c = new Configuration();
		
		SessionFactory sf = c.configure("hbm-m2m-mapping.cfg.xml").buildSessionFactory();
		
		System.out.println(sf);
		
		Session session = sf.openSession();
		System.out.println("Session started"+session);
		//Transaction tx = session.beginTransaction();
		
		
		
		
		//session.flush();
		
		//tx.commit();
		
		//System.out.println("The cart is inserted with id:"+cart.getId());
		
	}
}
