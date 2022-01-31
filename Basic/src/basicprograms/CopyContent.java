package basicprograms;

import java.io.*;
public class CopyContent {
	public static void main(String[] args) {

	    byte[] array = new byte[500];
	    try {
	      FileInputStream f1 = new FileInputStream("initial.txt");
	      FileOutputStream f2 = new FileOutputStream("final.txt");

	      f1.read(array);

	      f2.write(array);
	      System.out.println("The initial.txt file is copied to final.txt file.");

	      f1.close();
	      f2.close();
	    }
	    catch (Exception e) {
	      System.out.println("File not copied");
	    }
	  }
}
