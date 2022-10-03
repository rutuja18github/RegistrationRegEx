package com.userregistrationregex;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.registrationregex.UserRegistration;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterisedTestEmail {
	  public String email;
	  public boolean expectedOutput;
	  public UserRegistration userRegistrationObject;
	  private static final Logger log = LogManager.getLogger(UserRegistration.class);

	  public ParameterisedTestEmail(String email, boolean expectedOutput) {
	      super();
	      this.email = email;
	      this.expectedOutput = expectedOutput;
	  }
	  @Before
	  public void initialize() {
		  userRegistrationObject = new UserRegistration();
	  }
	  @Parameterized.Parameters
	  public static Collection input() {
	      return Arrays.asList(new Object[][] {
	          { "abc@yahoo.com", true },
	          { "abc-100@yahoo.com" , true },
	          { "abc.100@yahoo.com" , true },
	          { "abc111@abc.net" , true },
	          { "abc-100@abc.net" , true },
	          { "abc.100@abc.com.au" , true },
	          { "abc@1.com" , true },
	          { "abc@gmail.com.com" , true },
	          { "abc+100@gmail.com" , true },
	          { "pqr" , false },
	          { "abc()*@gmail.com" , false },
	          { "xyz@%*.in" , false },
	          { "mkg..2002@yahoo.com" , false },
	          { "abc.@gmail.com" , false },
	          { "g#@abc@@gmail.com" , false },
	          { "123@gmail.com.1a" , false },
	          { "pxr@gmail.com.olx.*" , false }
	      });
	  }
	  @Test
	  public void checkEmail() {
	      log.info("Email:" + this.expectedOutput);
	      Assert.assertEquals(this.expectedOutput, userRegistrationObject.validateEmail(this.email));
	  }
}
