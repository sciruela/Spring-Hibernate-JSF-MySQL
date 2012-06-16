/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kiubilabs.dao.impl;

import com.kiubilabs.dao.UserDao;
import com.kiubilabs.model.User;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author sciruela
 */
public class UserDaoImpl extends 
       HibernateDaoSupport implements UserDao{
 
	public void addUser(User user){
 
	
		getHibernateTemplate().save(user);
 
	}
 
	public List<User> findAllUser(){
 
		return getHibernateTemplate().find("from User");
 
	}
}
