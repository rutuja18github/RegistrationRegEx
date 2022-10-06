package com.registrationregex;

@FunctionalInterface
public interface UserRegistrationFunction {
	boolean matchPattern(String value, String pattern);
}
