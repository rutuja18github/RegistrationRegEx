package com.registrationregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserRegistration {
	private static final Logger logger = LogManager.getLogger(App.class);
	Scanner scanner = new Scanner(System.in);

	public void fillForm() {
		logger.info("Enter first name Start with Capital letter and has atleast 3 charecter");
		String firstName = scanner.nextLine();
		validateFirstName(firstName);
		logger.info("Enter last name Start with Capital letter and has atleast 3 charecter");
		String LastName = scanner.nextLine();
		validateLastName(LastName);
		logger.info("Enter Email ID e.g. abc.xyz@bl.co.in");
		String email = scanner.nextLine();
		validateEmail(email);


	}

	public boolean validateFirstName(String firstName) {
		Pattern patternObject = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher matcher = patternObject.matcher(firstName);
		if (matcher.matches() == false) {
			System.out.println("Invalid");
			logger.info("Enter valid First name");
			String newFirstName = scanner.nextLine();
			validateFirstName(newFirstName);
		}
		return matcher.matches();
	}
	public boolean validateLastName(String lastName) {
		Pattern patternObject = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher matcher = patternObject.matcher(lastName);
		if (matcher.matches()==false) {
			System.out.println("Invalid");
			logger.info("Enter valid Last name");
			String newLasttName = scanner.nextLine();
			validateFirstName(newLasttName);
		} 
		return matcher.matches();
	}
	public boolean validateEmail(String email) {
		Pattern patternObject = Pattern.compile("^[a-z]{1,3}[a-zA-Z0-9.]*@[a-z]*.[a-z]*.[a-z]*$");
		Matcher matcher = patternObject.matcher(email);
		if (matcher.matches()==false) {
			System.out.println("Invalid");
			logger.info("Enter valid email ");
			String newemail = scanner.nextLine();
			validateFirstName(newemail);
		} 
		return matcher.matches();
	}
}
