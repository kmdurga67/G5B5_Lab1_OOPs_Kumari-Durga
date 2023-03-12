package com.gl.learning.itapp.service;

import java.util.Random;

import com.gl.learning.itapp.model.Employee;

public class GenerateCredientials implements GenerateCrediential{
	
	 private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
     private static final String LOWER_CASE  = "abcdefghijklmnopqrstuvwxyz";
     private static final String NUMBER = "0123456789";
     private static final String SPECIAL_CHARS = "!@#$%^&*()_";
     private static final String PASSWORD_ALLOW_BASE = LOWER_CASE + UPPER_CASE + NUMBER + SPECIAL_CHARS;
     private static final Random random = new Random();

	@Override
	public String generateEmailAddress(String firstName, String lastName, String emailAddress,String company) {
		String email = firstName+lastName+"@"+emailAddress+"."+company+".com";
		return email;
	}

	@Override
	public String generateCredential(int maxLength) {
		//one way to generate crediential password 
		char[] password = new char[maxLength];
		String passwordChars = this.UPPER_CASE+this.LOWER_CASE+this.NUMBER+this.SPECIAL_CHARS;
		for(int i=0;i<maxLength;i++) {

			int random = (int) (Math.random() * passwordChars.length());

			password[i] = passwordChars.charAt(random);

			}
		//to Generate a random password which will contain (number, capital letter, small letter & special character)
		for (int i = 0; i < password.length; i++) {
			int j = random.nextInt(password.length);
        	char temp = password[j];
        	password[j] = temp;
			
		}
		return new String(password);
		
        // 2nd way to generate crediential password
//        StringBuilder passwordBuilder = new StringBuilder(maxLength);
        //atleast one lower case
        //passwordBuilder.append(LOWER_CASE.charAt(random.nextInt(LOWER_CASE.length())));
        
        //atleast one upper case
        //passwordBuilder.append(UPPER_CASE.charAt(random.nextInt(UPPER_CASE.length())));
        
        //atleast one number case
        //passwordBuilder.append(NUMBER.charAt(random.nextInt(NUMBER.length())));
        
        //atleast one special character case
        //passwordBuilder.append(SPECIAL_CHARS.charAt(random.nextInt(SPECIAL_CHARS.length())));
        
      //fill the rest of the password with random characters
//        for(int i = 4; i < maxLength; i++ ){
//        	passwordBuilder.append(PASSWORD_ALLOW_BASE.charAt(random.nextInt(PASSWORD_ALLOW_BASE.length())));
//        }
        
      //shuffle the characters in the password
//        char[] passwordChars = passwordBuilder.toString().toCharArray();
        //for (int i = 0; i < passwordChars.length; i++) {
          /*
           - get a random char from the array
           - store the char in a random char variable
           - assign the char from the random number to the i variable of the array
           - assign the temp char to the j variable
          */       	
//        	int j = random.nextInt(passwordChars.length);
//        	char temp = passwordChars[j];
//        	passwordChars[j] = temp;
//        }
        
        //return new String(passwordChars);
	}

	@Override
	public void displayCredentials(Employee employee) {
		System.out.println("Dear "+employee.getFirstName()+ " your generated credentials are as follows ");
		System.out.println("Email  ---> "+ employee.getEmailAddress());
		System.out.println("Password  ---> "+employee.getPassword());
		
	}

	
	

}
