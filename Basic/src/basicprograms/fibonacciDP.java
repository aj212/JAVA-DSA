package basicprograms;

import java.util.Scanner;

public class fibonacciDP {
	
	static int fib(int n) {
		int fib[]=new int[n+1];
		fib[0]=0;
		fib[1]=1;
		System.out.print(fib[0]+" ");
		System.out.print(fib[1]+" ");
		
		for(int i=2;i<=n;i++) {
			fib[i]=fib[i-1]+fib[i-2];
			
			System.out.print(fib[i]+" ");
			
		}
		return fib[n];
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n");
		int n=s.nextInt();
		
		fib(n);
		s.close();
		
	}

}
