package basicprograms;
import java.io.*;
public class reading {
	public static void main(String[] args) throws Exception {
		InputStreamReader read=new InputStreamReader(System.in);    
		BufferedReader buffer=new BufferedReader(read);            
	    System.out.println("Enter your content");    
	    String content=buffer.readLine();    
	    System.out.println("Your content is: "+content);    
	}

}
