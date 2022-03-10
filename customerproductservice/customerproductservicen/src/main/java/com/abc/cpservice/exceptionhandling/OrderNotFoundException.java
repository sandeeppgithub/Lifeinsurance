package com.abc.cpservice.exceptionhandling;

public class OrderNotFoundException extends RuntimeException{
	
	public OrderNotFoundException(String msg) { 
		super(msg);
	}
	
} 
