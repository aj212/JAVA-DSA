package basicprograms;
import java.util.Scanner;

public class lsearch {
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
	
	for(int j=0;j<arr.length;j++) {
		if(arr[j]==num) {
			System.out.println("Element found at position "+ (j+1));
		}
		else {
			System.out.println("Element not found");
		}
	}
}
}
