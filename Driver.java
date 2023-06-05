package com.greatlearning.main;

import java.util.*;
import com.greatlearning.model.*;
import com.greatlerning.services.CredentialService;



public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Employee employeee = new Employee();
		try {
			
			int i=10;
			int y=0;
			System.out.println(i/y);
			String str = null;
			if(str != null) {
				System.out.println(str.length());
				
			}
			divideNumbers(i,y);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			
		}
		catch(Throwable e) {
			System.out.println("Non arithmetic exceptions");
			e.printStackTrace();
			System.out.println(e.getMessage());
			handleException();
		}
		
		Employee employee = new Employee("harshit","Kumar");
		displayMenu();
		int option = scan.nextInt();
		
		CredentialService credService = new CredentialService();
		String[] departments = {"tech","admin","hr","legal"};
		
		String emailAddress = credService.generateEmailAddress(employee, departments[option-1]);
        String password = credService.generatePassword();
        
        employee.setEmail(emailAddress);
        employee.setPassword(password);
        
        credService.showCredentials(employee);

	}
	
	private static void divideNumbers(int i, int y) throws UserException{
		try {
			System.out.println(i/y);
		}catch(ArithmeticException ae) {
			throw new UserException("arithmetic exception, fall back to default");
		}
		
	}
	
	private static void handleException() {
		
	}

	public static void displayMenu() {
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		
	}
	
	public static Scanner scan = new Scanner(System.in);
}
