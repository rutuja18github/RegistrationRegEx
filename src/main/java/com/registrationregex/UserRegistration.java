package com.registrationregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserRegistration {
	private static final Logger logger = LogManager.getLogger(App.class);
	Scanner scanner = new Scanner(System.in);
	boolean isValid;

	UserRegistrationFunction userRegistration = (value, pattern) -> {
		Pattern patternObject = Pattern.compile(pattern);
		Matcher matchObject = patternObject.matcher(value);
		if (matchObject.matches()) {
			return true;
		} else {
			return false;
		}
	};

	// take input from user
	public void fillForm() {
		logger.info("Enter first name Start with Capital letter and has atleast 3 charecter");
		String firstName = scanner.nextLine();
		try {
			validateFirstName(firstName);
		} catch (InvalidInputException e) {
			e.printStackTrace();
		}

		logger.info("Enter last name Start with Capital letter and has atleast 3 charecter");
		String LastName = scanner.nextLine();
		try {
			validateLastName(LastName);
		} catch (InvalidInputException e) {
			e.printStackTrace();
		}
		logger.info("Enter Email ID e.g. abc.xyz@bl.co.in");
		String email = scanner.nextLine();
		try {
			validateEmail(email);
		} catch (InvalidInputException e) {
			e.printStackTrace();
		}
		logger.info("Enter mobile number country code followed by space and 10 digit number");
		String mobile = scanner.nextLine();
		try {
			validateMobile(mobile);
		} catch (InvalidInputException e) {
			e.printStackTrace();
		}

		logger.info("Enter a Password");
		String password = scanner.nextLine();
		try {
			validatePassword(password);
		} catch (InvalidInputException e) {
			e.printStackTrace();
		}

	}

	// validate First name
	public boolean validateFirstName(String firstName) throws InvalidInputException {
		isValid = userRegistration.matchPattern(firstName, "^^[A-Z]{1}[a-z]{2,}$");
		if (isValid) {
			return true;
		} else {
			throw new InvalidInputException("Invalid First Name");
		}
	}

	// validate Last name
	public boolean validateLastName(String lastName) throws InvalidInputException {
		isValid = userRegistration.matchPattern(lastName, "^^[A-Z]{1}[a-z]{2,}$");
		if (isValid) {
			return true;
		} else {
			throw new InvalidInputException("Invalid Last Name");
		}
	}

	// validate email
	public boolean validateEmail(String email) throws InvalidInputException {
		isValid = userRegistration.matchPattern(email, "^[A-Za-z0-9+.-]*@[a-z0-9.]*$");
		if (isValid) {
			return true;
		} else {
			throw new InvalidInputException("Invalid Email");
		}
	}

	// validate mobile number
	public boolean validateMobile(String mobile) throws InvalidInputException {
		isValid = userRegistration.matchPattern(mobile, "^[91]{2}[ ]{1}[0-9]{10}$");
		if (isValid) {
			return true;
		} else {
			throw new InvalidInputException("Invalid Mobile Number");
		}
	}

	// validate password
	public boolean validatePassword(String password) throws InvalidInputException {
		isValid = userRegistration.matchPattern(password,"^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}$");
		if (isValid) {
			return true;
		} else {
			throw new InvalidInputException("Invalid Password");
		}
	}

}
