package com.example.openshiftdemo.exception;

public class BookNotFoundException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5199700587871307289L;

	public BookNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
	
	public BookNotFoundException() {
        super();
    }
    // ...
}