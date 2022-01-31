package basicprograms;
import java.util.*;
public class Perfect {
public static void main(String[] args) {
	System.out.println("Enter no...");
	Scanner s =new Scanner(System.in);
	int n=s.nextInt();
	int sum=0;
	for(int i=1;i<=n/2;i++) {
		if(n%i==0) {
			sum+=i;
		}
	}
	if(sum==n) {
		System.out.println("Perfect");
	}
	else {
		System.out.println("Not Perfect");
	}
}
}
