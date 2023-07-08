package l12_hibernate_mappings.many2manyMappingFile;

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
		
		Item iphone = new Item();
		iphone.setDescription("iphone");
		iphone.setPrice(50000);
		
		Item macbook = new Item();
		macbook.setDescription("Macbook");
		macbook.setPrice(100000);
		
		Item airpod = new Item();
		airpod.setDescription("Airpod");
		airpod.setPrice(20000);
		
		Set<Item> itemSet1= new HashSet<Item>();
		itemSet1.add(iphone);
		itemSet1.add(macbook);
		
		Set<Item> itemSet2= new HashSet<Item>();
		itemSet2.add(iphone);
		itemSet2.add(airpod);
		
		Cart adityaCart = new Cart();
		adityaCart.setItems(itemSet1);
		adityaCart.setTotal(150000);
		
		Cart johnCart = new Cart();
		johnCart.setItems(itemSet2);
		johnCart.setTotal(70000);
		
		Transaction tx = session.beginTransaction();
		
		session.save(johnCart);
		
		session.save(adityaCart);
		
		
		
		
		
		
		session.flush();
		
		tx.commit();
		
		System.out.println("The cart is inserted with id:"+adityaCart.getId());
		
	}
}
