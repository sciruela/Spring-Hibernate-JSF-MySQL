/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kiubilabs.bean;

import com.kiubilabs.bo.UserBo;
import com.kiubilabs.model.User;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author sciruela
 */
public class UserBean implements Serializable{
 
	//DI via Spring
	UserBo userBo;

   
 
	public String first_name;
        public String last_name;
        public String phone;
	public String address;
        public String email;
	//getter and setter methods

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
 
	public void setUserBo(UserBo userBo) {
		this.userBo = userBo;
	}
 
	//get all customer data from database
	public List<User> getUserList(){
		return userBo.findAllUser();
	}
 
	//add a new customer data into database
	public String addUser(){
 
		User us = new User();
		us.setFirst_name(getFirst_name());
                us.setLast_name(getLast_name());
                us.setEmail(getEmail());
		us.setAddress(getAddress());
                us.setPhone(getPhone());
 
		userBo.addUser(us);
 
		clearForm();
 
		return "";
	}
 
	//clear form values
	private void clearForm(){
		setFirst_name("");
                setLast_name("");
                setEmail("");
                setPhone("");
		setAddress("");
	}
 
}
