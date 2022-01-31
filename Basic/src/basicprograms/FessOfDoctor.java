package basicprograms;
import java.util.*;
public class FessOfDoctor {
  public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	int fees=0;
	
	for(int i=0;i<n;i++) {
		int age=s.nextInt();
		arr[i]=age;
	}
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<1 ||arr[i]>120) {
			System.out.println("Invalid Input");
		}
		
		if(arr[i]<17) {
			fees=fees+200;
		}
		
		else if(arr[i]<40) {
			fees=fees+400;
		}
		
		else {
			fees=fees+300;
		}
	}
	
	System.out.println("Fees is "+fees);
	
}
}
