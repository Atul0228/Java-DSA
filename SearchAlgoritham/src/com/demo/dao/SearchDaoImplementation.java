package com.demo.dao;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SearchDaoImplementation implements SearchDao{
	static Scanner sc=new Scanner(System.in);
	
	
	public boolean addValues(int[] array,int size) {
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the value for "+(i));
			array[i]=sc.nextInt();
		}
		
		return true;
	}


	public void show(int[] array) {
		System.out.println("By IntStram class");
		IntStream.of(array).forEach(e->System.out.print(e+",\t"));
	}


	public int sequentialSearch(int[] array, int number) {
		
		for(int i=0;i<array.length;i++)
		{
			if(number==array[i])
			{
				return i;
			}
		}
		return -1;
	}


	public int binarySearch(int[] array, int number) {
		
		sort(array);
		int low=0;
		int high=array.length;
		
		while(low<=high) {
		int mid=(high+low)/2;
		
		if(array[mid]==number)
		{
			return mid;
		}else if(array[mid]<number)
		{
			low=mid+1;
		}else if(array[mid]>number)
		{
			high=mid-1;
		}
		}
		return -1;
	}


	private void sort(int[] array) {
		
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					int temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}
			}
		}
		
		
		show(array);
	}

}
