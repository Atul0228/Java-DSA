package TestSort;

import java.util.Scanner;

import ServiceSort.ServiceInterface;
import ServiceSort.ServiceSort;

public class TestSort {

	public static void main(String[] args) {
		ServiceInterface s=new ServiceSort();
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Entet the size of array");
		int number=sc.nextInt();
		int[] arr=new int[number];
		
		s.getArray(arr);
		
		int choice=0;
		
		do {
			System.out.println("\n1) Bubble Sort \n2) Quick Sort");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1->{
				
				int choice2=0;
				System.out.println("1) for Asecnding order\n 2) for descending Order");
				choice2=sc.nextInt();
				
				s.bubbleSort(arr, choice2);
			}
			case 2->{
				
			}
			}
		}while(choice<=6);
	}

}
