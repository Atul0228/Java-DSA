import java.util.Scanner;

class TestFile{


	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of array ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		ArrayInfo.accept(arr);

		int num=1;
		int choise;
		
		System.out.println("Enter the number For operation's");
			

		System.out.println(" 1) Display All prime Number from array");
		System.out.println(" 2) Sum of Odd Numbers");
		System.out.println(" 3) Factorial of number wo is less than 7 ");
		System.out.println(" 4) Find nth max prime number ");
		System.out.println(" 5) Find nth min prime number ");
		choise=sc.nextInt();
		switch(choise)
		{
			case 1:{
				int add=ArrayInfo.prime(arr);
				System.out.println("The Addition of prime number is:- "+add);
				}
			break;

			case 2:{
				int add=ArrayInfo.odd(arr);
				System.out.println("The Addition of odd number is:- "+add);
				}
			break;
			case 3:{
				
				ArrayInfo.factorial(arr);
				}
			break;
			case 4:{
				System.out.println("Enter the number for max number");
				int num1=sc.nextInt();
				//int num1=1;
				ArrayInfo.maxPrime(arr,num1);
				}
			break;
			
			case 5:{
				System.out.println("Enter the number for minimum");
				int num1=sc.nextInt();
				//int num1=1;
				ArrayInfo.minPrime(arr,num1);
				}
			break;
	
	
			default:{
				System.out.println("Hello");
			}
			break;
		}		

		
	}

}