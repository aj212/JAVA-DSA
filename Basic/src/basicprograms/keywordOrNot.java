package basicprograms;
import java.util.*;
public class keywordOrNot {
  public static void main(String[] args) {
	String s[]= {"break","case","continue","default","defer","else","for","func","goto","if","map","range","return","struct","type","var"};
	
	Scanner sn=new Scanner(System.in);
	String input=sn.nextLine();
	
	int flag=0;
	for(int i=0;i<s.length-1;i++) {
		if(s[i]==input) {
			flag=1;
			break;
		}
	}
	if(flag==1) {
		System.out.println(input+" is a keyword");
	}
	else {
		System.out.println(input+" is not a keyword");
	}
}
}
