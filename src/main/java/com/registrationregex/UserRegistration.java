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
		boolean firstNameResult = validateFirstName(firstName);
		while (firstNameResult == false) {
			logger.info("Enter valid First name");
			String newFirstName = scanner.nextLine();
			boolean value = validateFirstName(newFirstName);
			if (value) {
				break;
			}
		}
		logger.info("Enter last name Start with Capital letter and has atleast 3 charecter");
		String LastName = scanner.nextLine();
		boolean lastNameResult = validateLastName(LastName);
		while (lastNameResult == false) {
			logger.info("Enter valid Last name");
			String newLasttName = scanner.nextLine();
			boolean result = validateLastName(newLasttName);
			;
			if (result) {
				break;
			}
		}
		logger.info("Enter Email ID e.g. abc.xyz@bl.co.in");
		String email = scanner.nextLine();
		boolean emailResult = validateEmail(email);
		while (emailResult == false) {
			logger.info("Enter valid email ");
			String newemail = scanner.nextLine();
			boolean result = validateEmail(newemail);
			if (result) {
				break;
			}
		}
		logger.info("Enter mobile number country code followed by space and 10 digit number");
		String mobile = scanner.nextLine();
		boolean mobileResult=validateMobile(mobile);
		while (mobileResult == false) {
			logger.info("Enter valid mobile number ");
			String newMobile = scanner.nextLine();
			boolean value =validateMobile(newMobile);
			if (value) {
				break;
			}
		}
		logger.info("Enter a PassWord");
		String password = scanner.nextLine();
		boolean passwordResult=validatePassword(password);
		while (passwordResult == false) {
			logger.info("Enter valid password");
			String newPassWord = scanner.nextLine();
			boolean value = validatePassword(newPassWord);
			if (value) {
				break;
			}
		}

	}

	public boolean validateFirstName(String firstName) {
		Pattern patternObject = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher matcher = patternObject.matcher(firstName);
		if (matcher.matches()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validateLastName(String lastName) {
		Pattern patternObject = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher matcher = patternObject.matcher(lastName);
		if (matcher.matches()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validateEmail(String email) {
		Pattern patternObject = Pattern.compile("^[A-Za-z0-9+.-]*@[a-z0-9.]*$");
		Matcher matcher = patternObject.matcher(email);
		if (matcher.matches()) {
			return true;
		} else {
			return false;
		}
	}
	public boolean validateMobile(String mobile) {
		Pattern patternObject = Pattern.compile("^[91]{2}[ ]{1}[0-9]{10}$");
		Matcher matcher = patternObject.matcher(mobile);
		if (matcher.matches()) {
			return true;
		} else {
			return false;
		}
	}
	public boolean validatePassword(String password) {
		Pattern patternObject = Pattern.compile("^[a-zA-Z0-9]{8,}$");
		Matcher matcher = patternObject.matcher(password);
		if (matcher.matches()) {
			return true;
		} else {
			return false;
		}
	}

}
