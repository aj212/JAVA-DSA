package basicprograms;
import java.util.Scanner;

public class Shivam {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=s.nextLine();
		System.out.println("Enter the roll no.");
		int rno=s.nextInt();
		
		System.out.println("My name is "+name+" and my roll no. is "+rno);
	}

}
