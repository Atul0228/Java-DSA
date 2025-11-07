package com.demo.Array;

import java.util.Scanner;

public class ArrayFile {
	static Scanner sc=new Scanner(System.in);
	int [][] array;
	
	public ArrayFile()
	{
		array=new int[3][3];
	}
	
	public ArrayFile(int row,int col)
	{
		array=new int[row][col];
	}
	
	public void addArray1(ArrayFile arrayFile) {
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[0].length;j++)
			{
				System.out.println("Enter the value for "+(i+1)+" and "+(j+1));
				array[i][j]=sc.nextInt();
			}
		}
	}

	public void show() {
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[0].length;j++)
			{
				System.out.print("\t"+array[i][j]);
				
			}
			System.out.println();
		}
		
	}

	public int[][] add(ArrayFile b) {
		
		if(this.array.length == b.array.length && this.array[0].length == b.array[0].length)
		{
			int[][] sum=new int[b.array.length][b.array[0].length];
			
			
			for(int i=0;i<b.array.length;i++)
			{
				for(int j=0;j<b.array[i].length;j++)
				{
					sum[i][j]=this.array[i][j]+b.array[i][j];
				}
			}
			return sum;
		}
		
		return null;
	}

	public int[][] sub(ArrayFile b) {
		if(this.array.length == b.array.length && this.array[0].length == b.array[0].length)
		{
			int[][] sum=new int[b.array.length][b.array[0].length];
			
			
			for(int i=0;i<b.array.length;i++)
			{
				for(int j=0;j<b.array[i].length;j++)
				{
					sum[i][j]=this.array[i][j]-b.array[i][j];
				}
			}
			return sum;
		}
		
		return null;
	}
	
}
