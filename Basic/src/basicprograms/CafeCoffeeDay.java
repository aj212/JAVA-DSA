package basicprograms;
import java.util.*;
public class CafeCoffeeDay {
	
  public static void main(String[] args) {
	 
        String c[]={"Espresso Coffee","Cappuccino Coffee","Latte Coffee"};

	    String t[]={"Plain Tea","Assam Tea","Ginger Tea","Cardamom Tea","Masala Tea","Lemon Tea","Green Tea","Organic Darjeeling Tea"};

	    String s[]={"Hot and Sour Soup","Veg Corn Soup","Tomato Soup","Spicy Tomato Soup"};

	    String b[]={"Hot Chocolate Drink","Badam Drink","Badam-Pista Drink"};

	
	    Scanner sc=new Scanner(System.in);
	    
	    String ch=sc.nextLine();  
	    int item=sc.nextInt();
	    
	    switch(ch) {
	    
	     case "c":
	    	 for(int i=0;i<3;i++) {
	    		 if(item==i+1) {
	    			 System.out.println("Welcome to CCD!\nEnjoy your "+c[i]);
	    			 break;
	    		 }
	    		 if(i==3) {
	    			 System.out.println("Invalid Input");
	    		 }
	    	 }
	    	 
	     case "s":
	    	 for(int i=0;i<4;i++) {
	    		 if(item==i+1) {
	    			 System.out.println("Welcome to CCD!\nEnjoy your "+s[i]);
	    			 break;
	    		 }
	    		 if(i==4) {
	    			 System.out.println("Invalid Input");
	    		 }
	    	 }
	    	 
	     case "t":
	    	 for(int i=0;i<8;i++) {
	    		 if(item==i+1) {
	    			 System.out.println("Welcome to CCD!\nEnjoy your "+t[i]);
	    			 break;
	    		 }
	    		 if(i==8) {
	    			 System.out.println("Invalid Input");
	    		 }
	    	 } 	 
	    	 
	     case "b":
	    	 for(int i=0;i<3;i++) {
	    		 if(item==i+1) {
	    			 System.out.println("Welcome to CCD!\nEnjoy your "+b[i]);
	    			 break;
	    		 }
	    		 if(i==3) {
	    			 System.out.println("Invalid Input");
	    		 }
	    	 }
	    	
	     case "default":
	    	 System.out.println("Invalid Input");
	    	 
	    	 
	    	 /////////end of switch case
	    }
	    
	   
}
}
