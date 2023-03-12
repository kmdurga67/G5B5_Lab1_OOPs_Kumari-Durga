package com.gl.learning.itapp.service;

import com.gl.learning.itapp.model.Employee;

public interface GenerateCrediential {
	String generateEmailAddress(String firstName, String lastName,String emailAddress,String company);
	String generateCredential(int maxLength);
	void displayCredentials(Employee employee);
	

}
