package com.chne.maven.dao.impl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chne.maven.dao.impl.UserDaoHibernate;
/**
 * 
 * @author hjp
 * @Purpose: 单元测试，测试Spring与Hibernate的配置文件是否正确。
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserDaoHibernate userDao = (UserDaoHibernate) context.getBean("userDaoHibernate");
		userDao.addUser(null);
	}
}
