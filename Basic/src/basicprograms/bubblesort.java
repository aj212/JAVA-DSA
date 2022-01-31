package basicprograms;

import java.util.Scanner;

public class bubblesort {
     public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of elements");
		int n= s.nextInt();
		int arr[]=new int[n];
		System.out.println("enter elements:");
		for(int k=0;k<n;k++) {
			arr[k]=s.nextInt();                                    //best case time complexity is O(n) if we assume that all the elements are placed 
		}                                                          // correctly.
		for(int i=0;i<arr.length;i++) {                            //average and worst case time complexity will be O(n^2) if there is some swapping
			int flag=0;                                            //then both the loops will be executed     
			for(int j=0;j<arr.length-1-i;j++) {                                                
				 if(arr[j]>arr[j+1])
	             {
					 flag=1;
	                 int temp;
	                 temp=arr[j];
	                 arr[j]=arr[j+1];
	                 arr[j+1]=temp;
	             }
			}
			if(flag==0) {
				System.out.println("after sorting");
				for(int m=0;m<arr.length;m++) {
					System.out.print(arr[m]+" ");
			}
		}
		
		}
     }
}
