package com.userregistrationregex;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import com.registrationregex.UserRegistration;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
    public void validationForFirstName() {
        UserRegistration userObject = new UserRegistration();
        assertEquals(true, userObject.validateFirstName("Rutuja"));
    }
	
	@Test
    public void validationWithInvalidInputFirstName() {
        UserRegistration userObject = new UserRegistration();
        assertEquals(false, userObject.validateFirstName("ru"));
    }
	
	@Test
    public void FirstNameFirstLetterNotInCapital() {
        UserRegistration userObject = new UserRegistration();
        assertEquals(false, userObject.validateFirstName("rutuja"));
    }


    @Test
    public void validationForLastName() {
        UserRegistration userObject = new UserRegistration();
        assertEquals(true, userObject.validateLastName("Patil"));
    }
    
    @Test
    public void validationWithInvalidInputLastName() {
        UserRegistration userObject = new UserRegistration();
        assertEquals(false, userObject.validateFirstName("ru"));
    }
	
	@Test
    public void LastNameFirstLetterNotInCapital() {
        UserRegistration userObject = new UserRegistration();
        assertEquals(false, userObject.validateFirstName("rutuja"));
    }

    @Test
    public void validationForEmail() {
        UserRegistration userObject = new UserRegistration();
        assertEquals(true, userObject.validateEmail("rutujap09@gmail.com"));
    }

    @Test
    public void validationForInvalidEmail() {
        UserRegistration userObject = new UserRegistration();
        assertEquals(false, userObject.validateEmail("rutujap09gmail"));
    }
    
    @Test
    public void validationForPhoneNumber() {
        UserRegistration userObject = new UserRegistration();
        assertEquals(true, userObject.validateMobile("91 8564894789"));
    }
    @Test
    public void validationForInvalidPhoneNumber() {
        UserRegistration userObject = new UserRegistration();
        assertEquals(false, userObject.validateMobile("8564894789"));
    }

    @Test
    public void validationForPhoneNumberWithoutSpace() {
        UserRegistration userObject = new UserRegistration();
        assertEquals(false, userObject.validateMobile("918564894789"));
    }

    @Test
    public void validationForPassword() {
        UserRegistration userObject = new UserRegistration();
        assertEquals(true, userObject.validatePassword("Rutujap@coin"));
    }
    @Test
    public void validationForInvalidPassword() {
        UserRegistration userObject = new UserRegistration();
        assertEquals(true, userObject.validatePassword("rutujap@coin"));
    }
}

