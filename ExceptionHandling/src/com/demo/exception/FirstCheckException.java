package com.demo.exception;

public class FirstCheckException extends Exception{

	public FirstCheckException(String msg)
	{
		super(msg);
		System.out.println("This is Exception class constructor");
	}
}
