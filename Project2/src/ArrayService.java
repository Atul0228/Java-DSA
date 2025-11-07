import java.util.Scanner;


public class ArrayService {

	
	 static Scanner sc=new Scanner(System.in);
	
	
	public static void accept(int[][] arr) {
		
	      for(int i=0;i<arr.length;i++) {
	    	  for(int j=0;j<arr[0].length;j++) {
	          System.out.println(i+""+j);
	          
	          arr[i][j]=sc.nextInt();
	          
	         
	    	  }
	      }
	      
	      
	}
	public static void display(int[][] arr) {
		  for(int i=0;i<arr.length;i++) {
			  for(int j=0;j<arr.length;j++) {
				  System.out.println(arr[i][j]);			  }
		  }
	}
}

