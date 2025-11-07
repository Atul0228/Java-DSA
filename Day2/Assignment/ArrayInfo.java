import java.util.Scanner;

class ArrayInfo{

	public static void accept(int[] a)
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)		
		{
			System.out.println("Enter the value for index "+i+" :- \n");
			a[i]=sc.nextInt();
		}
	}

	public static int prime(int[] a)
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)		
		{	int cnt=0;
			for(int j=2;j<=(a[i]/2);j++)
			{
				if(a[i]==1 || a[i]==2)
				{
					sum+=a[i];
				System.out.println("Prime Number is :- "+a[i]);
				}else if(a[i]<=0){
				
					System.out.println("The number is not a positive");

				}
				else{
					if(a[i]%j==0)
					{       cnt++;
						break;
					}
					}
			}
			if(cnt==0)
			{
				System.out.println("Prime Number is :- "+a[i]);
				sum+=a[i];
			}
		}

		return sum;

	}


	public static int odd(int[] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++){
			if(a[i]%2!=0){
			System.out.println("the number is odd number"+a[i]);
			sum+=a[i];
					}
			}
			
		return sum;
	}
}