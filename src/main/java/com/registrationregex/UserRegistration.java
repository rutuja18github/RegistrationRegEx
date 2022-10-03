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

}
