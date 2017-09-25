package utilities;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class SessionFactoryObject {
	
	private static Session session;
	public static Session getSession(){
		session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		return session;
	}
}
