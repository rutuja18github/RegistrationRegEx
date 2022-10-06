package com.userregistrationregex;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import com.registrationregex.InvalidInputException;
import com.registrationregex.UserRegistration;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
    public void validationForFirstName() {
        UserRegistration userObject = new UserRegistration();
        try {
			assertEquals(true, userObject.validateFirstName("Rutuja"));
		} catch (InvalidInputException e) {
			assertEquals("Invalid First Name",e.getMessage());
		}
    }
	
	@Test
    public void validationWithInvalidInputFirstName() {
        UserRegistration userObject = new UserRegistration();
        try {
			assertEquals(false, userObject.validateFirstName("ru"));
		} catch (InvalidInputException e) {
			assertEquals("Invalid First Name",e.getMessage());
		}
    }
	
	@Test
    public void FirstNameFirstLetterNotInCapital() {
        UserRegistration userObject = new UserRegistration();
        try {
			assertEquals(false, userObject.validateFirstName("rutuja"));
		} catch (InvalidInputException e) {
			assertEquals("Invalid First Name",e.getMessage());
		}
    }


    @Test
    public void validationForLastName() {
        UserRegistration userObject = new UserRegistration();
        try {
			assertEquals(true, userObject.validateLastName("Patil"));
		} catch (InvalidInputException e) {
			assertEquals("Invalid Last Name",e.getMessage());
		}
    }
    
    @Test
    public void validationWithInvalidInputLastName() {
        UserRegistration userObject = new UserRegistration();
        try {
			assertEquals(false, userObject.validateFirstName("ru"));
		} catch (InvalidInputException e) {
			assertEquals("Invalid Last Name",e.getMessage());
		}
    }
	
	@Test
    public void LastNameFirstLetterNotInCapital() {
        UserRegistration userObject = new UserRegistration();
        try {
			assertEquals(false, userObject.validateFirstName("rutuja"));
		} catch (InvalidInputException e) {
			assertEquals("Invalid Last Name",e.getMessage());
		}
    }

    @Test
    public void validationForEmail() {
        UserRegistration userObject = new UserRegistration();
        try {
			assertEquals(true, userObject.validateEmail("rutujap09@gmail.com"));
		} catch (InvalidInputException e) {
			assertEquals("Invalid Email",e.getMessage());
		}
    }

    @Test
    public void validationForInvalidEmail() {
        UserRegistration userObject = new UserRegistration();
        try {
			assertEquals(false, userObject.validateEmail("rutujap09gmail"));
		} catch (InvalidInputException e) {
			assertEquals("Invalid Email",e.getMessage());		}
    }
    
    @Test
    public void validationForPhoneNumber() {
        UserRegistration userObject = new UserRegistration();
        try {
			assertEquals(true, userObject.validateMobile("91 8564894789"));
		} catch (InvalidInputException e) {
			assertEquals("Invalid Mobile Number",e.getMessage());
		}
    }
    @Test
    public void validationForInvalidPhoneNumber() {
        UserRegistration userObject = new UserRegistration();
        try {
			assertEquals(false, userObject.validateMobile("8564894789"));
		} catch (InvalidInputException e) {
			assertEquals("Invalid Mobile Number",e.getMessage());
		}
    }

    @Test
    public void validationForPhoneNumberWithoutSpace() {
        UserRegistration userObject = new UserRegistration();
        try {
			assertEquals(false, userObject.validateMobile("918564894789"));
		} catch (InvalidInputException e) {
			assertEquals("Invalid Mobile Number",e.getMessage());
		}
    }

    @Test
    public void validationForPassword() {
        UserRegistration userObject = new UserRegistration();
        try {
			assertEquals(true, userObject.validatePassword("Rutujap@coin"));
		} catch (InvalidInputException e) {
			assertEquals("Invalid Password",e.getMessage());
		}
    }
    @Test
    public void validationForInvalidPassword() {
        UserRegistration userObject = new UserRegistration();
        try {
			assertEquals(true, userObject.validatePassword("rutujap@coin"));
		} catch (InvalidInputException e) {
			assertEquals("Invalid Password",e.getMessage());
		}
    }
}

