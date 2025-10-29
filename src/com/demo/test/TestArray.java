package com.demo.test;

import java.util.Scanner;

import com.demo.Array.MyArray;

public class TestArray {

	public static void main(String[] args) {
		MyArray array=new MyArray();
		array.addValues();
		Scanner sc=new Scanner(System.in);
		int index;
		int value;
		boolean check;
		
//		System.out.println("Enter the Index and Value At Perticular position");
//		int index=sc.nextInt();
//		int value=sc.nextInt();
//		
//		boolean check=array.addPosition(index,value);
//		if(check)
//		{
//			System.out.println("Values Added");
//			array.show();
//		}else {
//			System.out.println("index not found");
//		}
		
//		System.out.println("Enter the Index Perticular position to delete the value");
//		 index=sc.nextInt();
//		
//		
//		 check=array.addDeleteByIndex(index);
//		if(check)
//		{
//			System.out.println("Values Deleted");
//			array.show();
//		}else {
//			System.out.println("index not found");
//		}
		
		
		System.out.println("Enter the value to enter at last");
		value=sc.nextInt();
		check=array.addLast(value);
		if(check)
		{
			System.out.println("Value Added");
			array.show();
		}else{
			System.out.println("Value not Add");
		}
		
	}

}
