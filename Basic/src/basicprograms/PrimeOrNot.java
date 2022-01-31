package basicprograms;
import java.util.*;
public class PrimeOrNot {
	public static void main(String[] args) {
		PrimeOrNot p=new PrimeOrNot();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no. u want to check...");
		int n=s.nextInt();
		p.checkPrime(n);
	}
 public void checkPrime(int n){
	 int c=0;
	 if(n<0) {
		 System.out.println("Please enter a positive no...");
	 }
	 else {
		 for(int i=2;i<n;i++) {
			 if(n%i==0) {
				 c+=1;
			 }
		 }
		 if(c>=1) {
			 System.out.println("Not Prime..");
		 }
		 else {
			 System.out.println("Prime");
		 }
	 }
 }
}

