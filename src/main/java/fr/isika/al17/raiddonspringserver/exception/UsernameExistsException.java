package fr.isika.al17.raiddonspringserver.exception;

public class UsernameExistsException extends Exception {
    private static final long serialVersionUID = 1L;

    public UsernameExistsException(String message) {
	super(message);
    }

}