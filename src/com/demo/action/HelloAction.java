package com.demo.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport{
	
	public String execute() {
		
		System.out.println("Inside the action...");
		
		return SUCCESS;
	}
}
