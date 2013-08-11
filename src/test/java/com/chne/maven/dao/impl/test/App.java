package com.chne.maven.dao.impl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chne.maven.dao.impl.UserDaoHibernate;
/**
 * 
 * @author hjp
 * @Purpose: ��Ԫ���ԣ�����Spring��Hibernate�������ļ��Ƿ���ȷ��
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserDaoHibernate userDao = (UserDaoHibernate) context.getBean("userDaoHibernate");
		userDao.addUser(null);
	}
}
