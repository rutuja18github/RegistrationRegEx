package com.registrationregex;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * User Registration
 *
 */
public class App {
	private static final Logger logger = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		logger.info("User Registration form Using Regex");
		UserRegistration user=new UserRegistration();
		user.fillForm();
	}
}
