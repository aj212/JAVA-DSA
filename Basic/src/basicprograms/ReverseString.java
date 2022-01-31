package basicprograms;
import java.util.*;
public class ReverseString {
 public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=s.next();
	
	StringBuilder str1=new StringBuilder(str);
	str1.reverse();
	System.out.println("Reversed String "+str1.toString());
}
}
