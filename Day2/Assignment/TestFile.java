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
		System.out.println(" 2) Sum of ");
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
				System.out.println("The Addition of prime number is:- "+add);
				}
			break;

			case 3:{
				int add=ArrayInfo.(arr);
				System.out.println("The Addition of prime number is:- "+add);
				}
			break;
	
			default:{
				System.out.println("Hello");
			}
			break;
		}		

		
	}

}