package com.demo.test;
import java.util.Scanner;

import com.demo.service.SearchService;
import com.demo.service.SearchServiceImplementation;



public class SearchAlgoTest {
 public static void main(String[] args) {
	 
	 SearchService s=new SearchServiceImplementation();
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("Enter the size of aray");
	 int size=sc.nextInt();
	 int number=0;
	 int index=0;
	 int[] array=new int[size];
	 int choice=0;
	 do {
		 System.out.println("1)Enter values\n2)Sequential search\n3)Binary Search\n4)exit");;
		 choice=sc.nextInt();
		 
		 switch(choice)
		 {
		 case 1->{
			 boolean check=s.addValues(array,size);
			 if(check)
			 {
				 System.out.println("Value Addes");
				 s.show(array);
			 }else {
				 System.out.println("Value Not Addes");
			 }
		 }
		 case 2->{
			 System.out.println("Sorting Array By Sequential Search");
			 System.out.println("Enter the value to be search and get index");
			  number=sc.nextInt();
			 
			 index=s.sequentialSearch(array,number);
			 
			 if(index!=-1)
			 {
				 System.out.println("The Number is found at Index "+index);
			 }else {
			 System.out.println("Number not found in array");
			 }
		 }
		 case 3->{
			 System.out.println("\nSorting Array By Binary Search");
			 System.out.println("Enter the value to be search and get index");
			 number=sc.nextInt();
			 
			 index=s.binarySearch(array,number);
			 
			 if(index!=-1)
			 {
				 System.out.println("The Number is found at Index "+index);
			 }else{
				 System.out.println("Number not found in array");
			 }
			 
		 }
		 case 4->{
			 System.out.println("Thank You");
			 sc.close();
		 }
		 default->{
			 System.out.println("Wrong choice");
		 }
		 }
	 }while(choice<=4);
	 
	 
	 

	 
	 
	 
 }
}
