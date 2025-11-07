package com.demo.Test;
import com.demo.Array.*;
import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		int choice=0;
		Scanner sc=new Scanner(System.in);
		
		ArrayFile a=null;
		ArrayFile b=null;
		
		do {
			System.out.println("1)Add Values To Array 1 \n2)Add Values To Array 2");
			System.out.println("3)Add Arrray 1 And Array 2\n4)Subtract Array1 and Array 2");
			System.out.println("5)Exit");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1->{
				System.out.println("Enter the Number of Rows");
				int row=sc.nextInt();
				System.out.println("Enter the Number of Colm");
				int colm=sc.nextInt();
				

				a.addArray1(new ArrayFile(row,colm));
				a.show();
				
			}
			
			case 2->{
				
				System.out.println("Enter the Number of Rows");
				int row=sc.nextInt();
				System.out.println("Enter the Number of Colm");
				int colm=sc.nextInt();
				
				
				b.addArray1(new ArrayFile(row,colm));
				b.show();
			}
			case 3->{
				int[][] add=a.add(b);
			}
			case 4->{
				int[][] sub=a.sub(b);
			}
			case 5->{
				sc.close();
			}
			}
			
		}while(choice<=5);
		

	}

}
