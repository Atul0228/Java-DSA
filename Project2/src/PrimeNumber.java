import  java.util.Scanner;
public class PrimeNumber {
	
	static void prime(int n) {
        if(n==1) {
        	System.out.println("no is prime");
        	}
        else {
        	
          int count=0;
          for(int i=2;i<n;i++) {
        	  if(n%i==0) {
        		  
        		  count++;
        	  }
          }
          if (count==0) {
        	  System.out.println("no is prime");
          }
          else
          {
        	  System.out.println("no is not prime");
          }
        }
	   }

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the no:");
		int num=sc.nextInt();
		PrimeNumber.prime(num);
	}
	
}
