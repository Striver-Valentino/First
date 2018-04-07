package cn.itcast.utils;

import org.hibernate.Session;

public class App {

	public static void main(String[] args) {
		Session session1 = HibernateSessionFactory.getSession();
		//System.out.println(session1);
		Session session2 = HibernateSessionFactory.getSession();
		
		//以线程方式创建的session
		System.out.println(session1 == session2);  // true
		
	}
}
