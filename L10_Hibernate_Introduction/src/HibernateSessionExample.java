
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateSessionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration c = new Configuration();
		
		SessionFactory sFactory = c.configure("hbm.cfg.xml").buildSessionFactory();
		
		Session s= sFactory.openSession();
		System.out.println("Session has been Opened.");
	}

}
