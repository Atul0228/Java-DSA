import java.util.Scanner;
public class TextFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of rows");
	int rows=sc.nextInt();
	System.out.println("Enter the no of colms");
	int cols=sc.nextInt();
	
	int[][] arr=new int[rows][cols];
	
	
	ArrayService.accept(arr);
	ArrayService.display(arr);
	
	

	}

}
