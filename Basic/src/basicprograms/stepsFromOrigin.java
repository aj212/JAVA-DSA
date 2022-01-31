package basicprograms;
import java.util.*;
public class stepsFromOrigin {
  public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	int n=s.nextInt();
	int distance=10;
	int x=0,y=0;
	char c='R';
	for(int i=0;i<n;i++) {
		switch(c) {
		case 'R':
		  x=x+distance;
		  distance=distance+10;
		  c='U';
		  break;
		  
		case 'U':
			  y=y+distance;
			  distance=distance+10;
			  c='L';
			  break;
			  
		case 'L':
			  x=x-distance;
			  distance=distance+10;
			  c='D';
			  break;
			  
		case 'D':
			  y=y-distance;
			  distance=distance+10;
			  c='A';
			  break;
			  
		case 'A':
			  x=x+distance;
			  distance=distance+10;
			  c='R';
			  break;
		}
	}
	
	System.out.println(x+" "+y);
}
}
