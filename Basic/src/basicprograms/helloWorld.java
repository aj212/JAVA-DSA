package basicprograms;

import java.util.Scanner;

public class helloWorld {
	public static void main(String args[]) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter your name:");
			int rno=s.nextInt();
			System.out.println("Enter your roll no...:");
			String name=s.nextLine();
			
			System.out.println("My name is "+name+"and my roll no. is "+rno);
		}
		}
	
}
