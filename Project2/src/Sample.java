import java.util.Scanner;

public class Sample {

	
	static void display() {
		System.out.println("hii");
	}
	static void add(int n,int n2) {
		int sum=0;
		sum=n+n2;
		System.out.println(sum);
		
	}
	static void evenodd(int n){
		if(n%2==0) {
			System.out.println("no is even");
		}
		else if(n%2!=0)
		{
			System.out.println("no is odd");
		}
		
	}
	
	
	public static void main(String args[]) {
//		System.out.println("hiiiii");
		Sample.display();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1:");
		int num1=sc.nextInt();
//		System.out.println("Enter num2");
//		int num2=sc.nextInt();
		//Sample.add(num1,num2);
		Sample.evenodd(num1);
		
		
	}

}
