import java.util.Arrays;

public class Insertion_Sort {

	public static void main(String[] args) {
//		int[] arr={21,3,4,12,5};
		
//		int temp,j,i,key=0;
//		int index=0;
//		boolean flag=false;
//		
//		
//		for(i=0;i<arr.length;i++)
//		{
//			for(j=i+1;j<arr.length;j++) 
//			{
//				if(arr[i]>arr[j])
//				{
//					flag=true;
//					key=j;
//				}
//			}
//			
//			if(flag)
//			{
//				temp=arr[i];
//				arr[i]=arr[key];
//				arr[key]=temp;
//				flag=false;
//			}
//			
//			for(int k=0;k<i;k++) 
//			{
//				for(int l=k+1;l<i;l++)
//				{
//					if(arr[k]>arr[l])
//					{
//						temp=arr[k];
//						arr[k]=arr[l];
//						arr[l]=temp;
//					}
//				}
//			}
//				
//		}
		
		
//		int key;
//		for(int i=1;i<arr.length;i++)
//		{
//			key=arr[i];
//			int j=0;
//			
//			while( arr[j]>key && j<arr.length-1)
//			{
//				int temp=arr[j];
//				arr[j]=key;
//				key=temp;
//				j++;
//				
//				
//			}
//		}
		int[] arr={20,16,10,82,77};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			int key=arr[i];
			int j=0;
			while(j<i)
			{
				if(key<arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					System.out.println(Arrays.toString(arr));
					j++;
				}else {
					j++;
				}
			}
		}
		
		
		System.out.println(Arrays.toString(arr));

	}

}
