/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kiubilabs.dao;

import com.kiubilabs.model.User;
import java.util.List;

/**
 *
 * @author sciruela
 */
public interface UserDao{
 
	void addUser(User user);
 
	List<User> findAllUser();
 
}
