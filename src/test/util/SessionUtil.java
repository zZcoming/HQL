package test.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Administrator on 2016-3-14.
 */
public class SessionUtil {
	public static Session getSession() {
		SessionFactory factory = null;
		try{
			factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
		return factory.getCurrentSession();
	}
}
