package fr.isika.al17.raiddonspringserver.constants;

public class Constants {
    
    private Constants() {
	    throw new IllegalStateException("Utility class");
	  }

    
    public static final String CROSS_ALLOW ="Access-Control-Allow-Origin";
    public static final String ROLE_NOT_FOUND = "Error: Role is not found";
    public static final String USERNAME_EXISTS = "Error: Username is already taken!";
    public static final String EMAIL_EXISTS = "Error: Email is already in use!";

}
