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
}
