package com.ithc.demo1;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.ithc.utils.HibernateUtils;

public class Demo {
	@Test
	public void run1(){
		
		Session session = HibernateUtils.getSession();
		
		Transaction tr = session.beginTransaction();
		
		User user = new User();
		
		user.setName("小凤");
		
		session.save(user);
		
		tr.commit();
		session.close();
	}
}
