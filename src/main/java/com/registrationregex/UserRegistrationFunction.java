package com.registrationregex;

@FunctionalInterface
public interface UserRegistrationFunction {
	boolean pattern(String value, String pattern);
}
