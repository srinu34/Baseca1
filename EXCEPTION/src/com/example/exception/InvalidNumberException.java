package com.example.exception;

public class InvalidNumberException  extends Exception{

	public InvalidNumberException()
	{
		super("Invalid Arguments:");
	}
	public InvalidNumberException(String message)
	{
		super(message);
	}
}
