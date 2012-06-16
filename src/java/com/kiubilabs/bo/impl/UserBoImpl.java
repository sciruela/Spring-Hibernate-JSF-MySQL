/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kiubilabs.bo.impl;

import com.kiubilabs.bo.UserBo;
import com.kiubilabs.dao.UserDao;
import com.kiubilabs.model.User;
import java.util.List;

/**
 *
 * @author sciruela
 */
public class UserBoImpl implements UserBo{
 
	UserDao userDao;
 
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
 
	public void addUser(User user){
 
		userDao.addUser(user);
 
	}
 
	public List<User> findAllUser(){
 
		return userDao.findAllUser();
	}
}