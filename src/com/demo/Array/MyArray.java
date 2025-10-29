package com.demo.Array;

import java.util.Scanner;

public class MyArray {

	int[] array;
	int count;
	Scanner sc=new Scanner(System.in);
	public MyArray()
	{
		array=new int[10];
		count=10;
	}
	
	public MyArray(int[] arr)
	{
		array=arr;
		count=arr.length;
	}
	
	public MyArray(int[] arr,int count)
	{
		array=arr;
		this.count=count;
	}

	public void addValues() {
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Enter the value for "+(i+1));
			array[i]=sc.nextInt();
		}
		System.out.println("Values Added");
		
	}
	
	public void show()
	{
		for(int i=0;i<count;i++)
		{
			System.out.print(array[i]+"\t");
		}
	}

	public boolean addPosition(int index, int value) {
		if(index<=count-1)
		{
			for(int i=count-1;i>index;i--)
			{
				int temp=array[i];
				array[i]=array[i-1];
				array[i-1]=value;
			}
			return true;
		}
		return false;
	}

	public boolean addDeleteByIndex(int index) {
		if(index<count-2)
		{
			System.out.println("Hello");
			for(int i=index;i<count-1;i++)
			{
				int temp=array[i+1];
				array[i]=temp;
				array[i+1]=0;
			}
			return true;
			
		}
		else if(index<=count-1)
		{
			for(int i=index;i<count;i++)
			{
				array[i]=0;
			}
			return true;
			
		}
		return false;
		
	}

	public boolean addLast(int value) {
		array[count-1]=value;
		return true;
	}
	
	
}
