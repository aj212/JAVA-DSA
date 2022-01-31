package basicprograms;

import java.util.Scanner;

public class bsearch {
	 public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter size of array");
			int n=s.nextInt();
			int arr[]=new int[n];
			System.out.println("Enter elements of array");
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			
			System.out.println("Enter the element u want to search");
			int num=s.nextInt();
			
			int start=0;
	        int end=arr.length;
	        while(start<=end)
	        {
	            int mid=(start+end)/2;
	            if(arr[mid]==num)
	            {
	                System.out.println("Element found at position "+ (mid+1));
	                break;
	            }
	            else if(arr[mid]<num)
	            {
	                start=mid+1;
	            }
	            else if(arr[mid]>num)
	            {
	             end=mid-1;
	            }
	        
	        }
	        if(start==end) {
	        	System.out.println("Elemrnt not found");
	        }
			
			
			}
		}


