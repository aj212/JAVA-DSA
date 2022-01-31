package basicprograms;
import java.io.*;
import java.util.Scanner;

public class displayfile {
	 public static void main(String[] input)
	    {
	        String fname;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the name of file: ");
	        fname = s.nextLine();

	        String line = null;
	        try
	        {
	            
	            FileReader fileReader = new FileReader(fname);
	            BufferedReader bufferedReader = new BufferedReader(fileReader);
	            
	            while((line = bufferedReader.readLine()) != null)
	            {
	                System.out.println(line);
	            }
	            
	           
	            bufferedReader.close();
	            s.close();
	            
	        }
	        catch(IOException exception)
	        {
	            System.out.println("Error in reading file "+fname);
	        }
	    }
}
