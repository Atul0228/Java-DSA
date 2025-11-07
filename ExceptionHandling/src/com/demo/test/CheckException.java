package com.demo.test;
import java.util.Scanner;

import com.demo.exception.FirstCheckException;


public class CheckException {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the Number");
		int num1=sc.nextInt();
		
		System.out.println("Enter the Number");
		int num2=sc.nextInt();
		
		if(num1==0 || num2==0)
		{
			throw new FirstCheckException("The number must be greater than Zero");
		}
		}catch(FirstCheckException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
