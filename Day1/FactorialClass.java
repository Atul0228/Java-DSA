import java.util.Scanner;

class FactorialClass{
	
	static int fact=1;
	static int cal(int n)
	{
		if(n==0)
		{
			return 0;
		}
		
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;		
		}
		return fact;		
	}

public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int number=sc.nextInt();
	int a = cal(number);

	
	System.out.println(a);
	
}
}
