import java.util.Scanner;
public class TestArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number of matrix Row's");
		int row=sc.nextInt();
		int[] colmArray=new int[row];
		
		for(int i=0;i<row;i++)
		{
			System.out.println("Enter the number of Colums in row "+(i+1));
			colmArray[i]=sc.nextInt();
		}
		
		
		int[][] TwoDMatrix=new int[row][];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<colmArray[i];j++)
			{
				System.out.println("Enter the value for row numbwer "+(i)+" and colm number "+(j));
				TwoDMatrix[i][j]=sc.nextInt();
			}
		}
		
		
		int choice=0;
		
		do {
		
			System.out.println("1) Sum of Row's");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1->
					{
						System.out.println("Two D Matrix Array Row Addition is");
						int[] sum = ArrayService.rowSum(TwoDMatrix);
						
						for(int i:sum)
						{
							System.out.println("Sum for Row "+(i+1)+" is "+sum[i]);
						}
					}
			}
		}while(choice!=9);

}
