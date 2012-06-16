/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kiubilabs.bo;

import com.kiubilabs.model.User;
import java.util.List;

/**
 *
 * @author sciruela
 */
public interface UserBo{
 
	void addUser(User user);
 
	List<User> findAllUser();
 
}
