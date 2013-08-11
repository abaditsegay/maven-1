package com.chne.maven.dao.impl;




import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.chne.maven.dao.IUserDao;
import com.chne.maven.model.User;

public class UserDaoHibernate implements IUserDao {
	private SessionFactory sessionFactory;
	public void addUser(User u) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from User where 1=1");
		List<User> users=query.list();
		System.out.println("Size:"+users.size());
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


}
