package com.app.exception;
//Define the package for this exception

//Import Lombok's @Getter annotation for simplicity
import lombok.Getter;

/**
* BookingException is a custom exception class for handling booking-related
* errors.
*/
@Getter
public class BookingException extends RuntimeException {

	/**
	 * Constructs a new BookingException with the specified message and cause.
	 * 
	 * @param message the error message
	 * @param cause   the cause of the exception
	 */
	public BookingException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructs a new BookingException with the specified message.
	 * 
	 * @param message the error message
	 */
	public BookingException(String message) {
		super(message);
	}
}
