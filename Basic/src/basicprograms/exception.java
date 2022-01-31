package basicprograms;

import java.io.*;

public class exception {

	public static void main(String[] args) {
		
		int a=5;
		int b=0;
		
		try {			
			
		     int divide=a/b;
		     throw new ArithmeticException("divide by zero");
		}
		     
		catch(ArithmeticException c) {
			System.out.println("Error passed in catch block "+ c);
		}
		
		finally{
				System.out.println("exception was produced");
			}
		
		
			
		
		
		}
	class show{
		void display() throws IOException
		{
			throw new IOException("exception thrown");
	 }
	}
	
	}

