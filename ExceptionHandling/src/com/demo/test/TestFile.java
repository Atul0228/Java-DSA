package com.demo.test;
import java.util.Scanner;

import com.demo.exception.FileException;

import java.io.*;

public class TestFile {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		FileInputStream readOnlyFile=null;
		FileOutputStream writeOnlyFile=null;
		try {
			//System.out.println("Enter the file name to open");
			//String fileName=sc.nextLine();
			//path of file should be absolute
			
			
		readOnlyFile=new FileInputStream("C:\\Users\\IET\\Desktop\\Mukund\\Java\\ExceptionHandling\\src\\com\\demo\\test\\DataCopyFrom.txt");
		System.out.println(readOnlyFile); // Give an object reference 
		
		writeOnlyFile =new FileOutputStream("C:\\Users\\IET\\Desktop\\Mukund\\Java\\ExceptionHandling\\src\\com\\demo\\test\\DataCopyTo.txt");
		//by using read we can get a value of one one byte
		int oneChar=readOnlyFile.read();
		
		//This will print one one char on the screen
		while(oneChar!=-1)
		{
			System.out.print((char)oneChar);
			oneChar = readOnlyFile.read();
		}
		
		
//		Logic to copy data from one file to another
		int copyChar=readOnlyFile.read();
		
		while(copyChar != -1)
		{
			writeOnlyFile.write(copyChar);
			copyChar=readOnlyFile.read();
		}
		
		throw new FileException("File not found exception");
		
		}catch(FileException e)
		{
			System.out.println("Error: "+e.getMessage());
		}finally {
			readOnlyFile.close();
			writeOnlyFile.close();
		}
	}

}
