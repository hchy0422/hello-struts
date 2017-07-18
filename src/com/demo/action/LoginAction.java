package com.demo.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	
	private String userName;
	
	public String execute() {
		
		System.out.println("Received: " + userName);
		
		if(userName.equals("Admin")) {
			return SUCCESS;
		} else {
			return ERROR;
		}
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
