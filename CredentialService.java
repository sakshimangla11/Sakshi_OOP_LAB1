package com.greatlerning.services;

import com.greatlearning.interfaces.ICredentials;
import com.greatlearning.model.Employee;
import java.util.*;

public class CredentialService implements ICredentials {

	@Override
	public String generateEmailAddress(Employee employee, String department) {
		// TODO Auto-generated method stub
		return employee.getFirstName() + employee.getLastName() + "@"+department+"gl.in";
		
	}

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		String values = capitalLetters+smallLetters+numbers+specialCharacters;
		Random random = new Random();
		String password = "";
		String capitalChar = String.valueOf(capitalLetters.charAt(random.nextInt(capitalLetters.length())));
		String numberChar = String.valueOf(smallLetters.charAt(random.nextInt(numbers.length())));
		for(int i =0;i< 6;i++) {
			password += String.valueOf(values.charAt(random.nextInt(values.length())));
		}
		//String.valueOf(0);
		System.out.println("random character is "+values.charAt(random.nextInt(values.length())));
		return password+capitalChar+numberChar;
		//return null;
	}

	@Override
	public void showCredentials(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("Employee Name"+employee.getFirstName());
		System.out.println("Email"+ employee.getLastName());		;
		System.out.println("Password"+employee.getPassword());
	}
	
	

}
