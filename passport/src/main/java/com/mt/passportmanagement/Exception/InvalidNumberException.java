package com.mt.passportmanagement.Exception;

public class InvalidNumberException extends Exception {
	public InvalidNumberException()
	{
		super("No Such ID is There:");
	}
	public InvalidNumberException(String message)
	{
		super(message);
	}

}
