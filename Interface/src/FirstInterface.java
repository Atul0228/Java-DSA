import java.util.Scanner;

import Beans.InterfaceClass;

public class FirstInterface implements InterfaceClass{
	
	public void ShowName(String name)
	{
		System.out.println("This is Lambda function call and printing some value");
		System.out.println(" Name:- "+name);
	}

	public void showVariableA()
	{
		
		System.out.println("The value of variable A is :- "+a);
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		InterfaceClass f1=new FirstInterface();
		//f1.showVariableA();
		f1.print();
		
		
		//InterfaceClass f2=(name)->{System.out.println("Hello from Interface Lambda function object ");};
		
		InterfaceClass f2 = (name) -> {
            System.out.println("Hello from Interface Lambda function object ");
            System.out.println("Name:- " + name);
        };
		f2.ShowName("Atul");
		
	}

}
