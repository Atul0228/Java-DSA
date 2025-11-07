package com.demo.test;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
	int [] arr= {10,4,2,19,18,2,1};
	
	
		
		    for (int i=0;i<arr.length;i++) {
			int start=arr[i];
			//int min=;
			 for (int j = i+1; j < arr.length; j++) {
				 int min = arr[j];
			     if (arr[j] <min) {
			     min = arr[j]; 
			  }
			 if(arr[i]>min) {
				int temp=arr[i];
				 arr[i]=min;
				 arr[j]=temp;
			 }
				
				
				
				
				
		}
			 System.out.println(Arrays.toString(arr));
		
	}

	}

}
