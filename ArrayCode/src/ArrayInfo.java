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
				if( a[i]==2)
				{
					sum+=a[i];
				System.out.println("Prime Number is :- "+a[i]);
				}else if(a[i]<=0){
				
					System.out.println("The number is not a positive");

				}
				else{
					if(a[i]%j==0)
					{   cnt++;
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
	
	
	public static void factorial(int[] n) {
		
		for(int i=0;i<n.length;i++)
		{
			int fact=1;
			if(n[i]<=7) 
			{
				for(int j=1;j<=n[i];j++)
				{
					fact=fact*j;
				}
			}
			 System.out.println("The factorial of "+(n[i])+" is "+fact);
			}
			
			}
			
			
			public static void maxPrime(int[] a, int num1) {
				
				int[] primeArray=new int[a.length];
				for(int i=0;i<a.length;i++)
				{
					primeArray[i]=-1;
				}
				
				int count=0;
				for(int i=0;i<a.length;i++) 
				{
					int cnt=0;
					
					for(int j=2;j<=(a[i]/2);j++)
					{
						if(a[i]==2) 
						{
							primeArray[count]=a[i];
							count++;
							//System.out.println(a[i]);
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
						primeArray[count]=a[i];
						count++;
						//System.out.println(a[i]);
					}
					
	
				}
				
//				for(int i=0;i<primeArray.length;i++)
//				{
//					System.out.println("\t "+(primeArray[i]));
//				}
//				
				sortPrime(primeArray, num1);
				
				}

			private static void sortPrime(int[] primeArray, int num1) {
				// TODO Auto-generated method stub
				
				
				for(int i=0;i<primeArray.length-1;i++)
				{
					for(int j=i+1;j<primeArray.length;j++)
					{
					if(primeArray[i]<primeArray[j])
					{
						int temp=primeArray[j];
						primeArray[j]=primeArray[i];
						primeArray[i]=temp;
					}
					}
				}
				
				for(int i=0;i<primeArray.length;i++)
				{
					System.out.print("\t "+(primeArray[i]));
				}
				
				System.out.println("\nThe maximum prime number is "+(primeArray[num1-1]));
				
			}
			
			
public static void minPrime(int[] a, int num1) {
				
				int[] primeArray=new int[a.length];
				for(int i=0;i<a.length;i++)
				{
					primeArray[i]=-1;
				}
				
				int count=0;
				for(int i=0;i<a.length;i++) 
				{
					int cnt=0;
					
					for(int j=2;j<=(a[i]/2);j++)
					{
						if(a[i]==2) 
						{
							primeArray[count]=a[i];
							count++;
							//System.out.println(a[i]);
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
						primeArray[count]=a[i];
						count++;
						//System.out.println(a[i]);
					}
					
	
				}
				
//				for(int i=0;i<primeArray.length;i++)
//				{
//					System.out.println("\t "+(primeArray[i]));
//				}
//				
				sortPrime2(primeArray, num1);
				
				}
			
private static void sortPrime2(int[] primeArray, int num1) {
    // Sort the array in ascending order
    for (int i = 0; i < primeArray.length - 1; i++) {
        for (int j = i + 1; j < primeArray.length; j++) {
            if (primeArray[i] > primeArray[j]) {
                int temp = primeArray[j];
                primeArray[j] = primeArray[i];
                primeArray[i] = temp;
            }
        }
    }

    // Print the sorted array
    System.out.println("Sorted Prime Array:");
    for (int i = 0; i < primeArray.length; i++) {
        System.out.print("\t" + primeArray[i]);
    }

    // Find and print the minimum prime number >= num1
    System.out.println("\nMinimum prime number ≥ " + num1 + " is:");
    boolean found = false;
    for (int i = 0; i < primeArray.length; i++) {
        if (primeArray[i] >= num1) {
            System.out.println(primeArray[i]);
            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("No prime number in the array is greater than or equal to " + num1);
    }
}

			
		
	}
