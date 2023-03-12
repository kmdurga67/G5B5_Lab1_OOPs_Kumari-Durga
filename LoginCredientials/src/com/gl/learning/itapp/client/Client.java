package com.gl.learning.itapp.client;
import java.util.*;

import com.gl.learning.itapp.model.Employee;
import com.gl.learning.itapp.service.GenerateCredientials;

public class Client {

	public static void main(String[] args) {
	Employee employee = new Employee("Kumari","Durga");
	 employee.setCompany("Wipro");
	GenerateCredientials credientials = new GenerateCredientials();
	 System.out.println("Please enter the department from the following ");
     System.out.println("1. Technical");
     System.out.println("2. Admin");
     System.out.println("3. Human Resource");
     System.out.println("4. Legal");
     //Create the intstance of scanner class
     Scanner sc = new Scanner(System.in);
     int option = sc.nextInt();
     
     switch (option) {
     case 1:{
    		String generatedEmail = credientials.generateEmailAddress(employee.getFirstName().toLowerCase(),
						employee.getLastName().toLowerCase(), "tech",employee.getCompany().toLowerCase());
    		String	generatedPassword = credientials.generateCredential(12);
    		employee.setEmailAddress(generatedEmail);
    		employee.setPassword(generatedPassword);
    		credientials.displayCredentials(employee);
        break;
    }
     case 2:{
    		String generatedEmail = credientials.generateEmailAddress(employee.getFirstName().toLowerCase(),
						employee.getLastName().toLowerCase(), "adm",employee.getCompany().toLowerCase());
    		String	generatedPassword = credientials.generateCredential(12);
    		employee.setEmailAddress(generatedEmail);
    		employee.setPassword(generatedPassword);
    		credientials.displayCredentials(employee);
        break;
    }
    case 3:{
        String generatedEmail = credientials.generateEmailAddress(employee.getFirstName().toLowerCase(),
        employee.getLastName().toLowerCase(), "hr",employee.getCompany().toLowerCase());
        String  generatedPassword = credientials.generateCredential(12);
        employee.setEmailAddress(generatedEmail);
		employee.setPassword(generatedPassword);
        credientials.displayCredentials(employee);
        break;
    }
    case 4:{
        String generatedEmail = credientials.generateEmailAddress(employee.getFirstName().toLowerCase(),
        employee.getLastName().toLowerCase(), "legal",employee.getCompany().toLowerCase());
        String generatedPassword = credientials.generateCredential(12);
        employee.setEmailAddress(generatedEmail);
		employee.setPassword(generatedPassword);
        credientials.displayCredentials(employee);
        break;
    }
     default: {
			System.out.println("Enter a valid option");
		}      
     
     }
     
     

	}

}
