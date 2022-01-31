package basicprograms;
import java.util.*;
public class ParentChildCommission {
	int total_amt=5000;
  public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String parent=s.nextLine();
	String hasChild=s.nextLine();
	
	if(hasChild=="N") {
		System.out.println("Total Members: 1");
		System.out.println("Commission Details:");
		double comm=0.05*5000;
		System.out.println(parent+": "+comm);
	}
	
}
}
