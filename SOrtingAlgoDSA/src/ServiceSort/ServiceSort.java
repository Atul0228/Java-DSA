package ServiceSort;

import java.util.Arrays;
import java.util.Scanner;

public class ServiceSort implements ServiceInterface{

	static Scanner sc=new Scanner(System.in);
	@Override
	public void getArray(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter value at index"+(i+1));
			arr[i]=sc.nextInt();
		}
		
	}
	
	@Override
	public void bubbleSort(int[] arr,int flag1) {
	
		if(flag1==1)
		{
			for(int i=0;i<arr.length;i++)
			{
				boolean flag=false;
				for(int j=i+1;j<arr.length-i;j++)
				{
					if(arr[i]>arr[j])
					{
						flag=true;
						int temp=arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
					}
					
					
				}
				if(flag==false)
				{
					System.out.println("Array get sorted in Ascending");
					show(arr);
					break;
				}
			}
		}else {
			for(int i=0;i<arr.length;i++)
			{
				boolean flag=false;
				for(int j=i+1;j<arr.length-i;j++)
				{
					if(arr[i]<arr[j])
					{
						flag=true;
						int temp=arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
					}
					
					
				}
				if(flag==false)
				{
					System.out.println("Array get sorted in desending");
					show(arr);
					break;
				}
			}
		}
		
	}

	private void show(int[] arr) {
		
		System.out.print(Arrays.toString(arr));
		
	}

}
