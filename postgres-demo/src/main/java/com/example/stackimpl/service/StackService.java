package com.example.stackimpl.service;

public class StackService {

	
	public String push(String input) {
		String query="Insert into stack (value) values(input);";
		
		
		return query;
	}
	
}
