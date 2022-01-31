package basicprograms;
import java.util.*;
public class CostOfPainting {
  public static void main(String[] args) {
	  
 float total_cost=0;
 float icost=0;
 float ocost=0;
	
 Scanner s=new Scanner(System.in);
 int iwall=s.nextInt();
 int owall=s.nextInt();
 
 /////taking input of surface area of each wall
 
 if(iwall==0 && owall==0) {
	 System.out.println("Total cost is 0.0");
 }
 
 if(iwall<0 || owall<0) {
	 System.out.println("Inavalid Input");
 }
 
 for(int i=0;i<iwall;i++) {
	 float inner_area=s.nextFloat();
	 icost=icost+(inner_area*18);
 }
 
 for(int i=0;i<owall;i++) {
	 float outer_area=s.nextFloat();
	 ocost=ocost+(outer_area*12);
 }
 
 total_cost=ocost+icost;
 System.out.println("Total Cost is "+total_cost);
 
}
}
