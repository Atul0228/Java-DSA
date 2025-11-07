import java.util.Scanner;

class TestFile{

	public static void accept(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{	Scanner sc=new Scanner(System.in);
			System.out.print("Enter the Value for index of arrray "+i+"");
			a[i]=sc.nextInt();
			System.out.println("");
		}
	}
		
	public static int sum(int[] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}

		return sum;
	}	

	public static void dispaly(int[] a){
	System.out.println("The array are: \n");
	for (int i=0;i<a.length;i++){
	System.out.print(+a[i]);
	}
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of Array");
		int size=sc.nextInt();

		int[] arr=new int[size];

		accept(arr);

		int sum=sum(arr);
		System.out.println("The sum of an array is "+sum);
                
        dispaly(arr);
	}
}