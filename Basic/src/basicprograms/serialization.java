package basicprograms;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 class serialization implements Serializable {
 
String fname;
  String lname;
  
  serialization(String fname,String lname){
	  this.fname=fname;
	  this.lname=lname;
  }
}
 class main{
	public main(String[] args) throws ClassNotFoundException {
		serialization s=new serialization("Anmol","Joshi");
		String file_name="serialization.ser";
		
		try
		{    
            FileOutputStream file = new FileOutputStream(file_name); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
 
            out.writeObject(s); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized"); 
  
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        }
		
		serialization s1 =null;
		
		 try
	        {    
	           
	            FileInputStream file = new FileInputStream(file_name); 
	            ObjectInputStream in = new ObjectInputStream(file); 
	              
	            s1 = (serialization)in.readObject(); 
	              
	            in.close(); 
	            file.close(); 
	              
	            System.out.println("Object has been deserialized "); 
	            System.out.println("First name is " + s1.fname); 
	            System.out.println("Last name is " + s1.lname); 
	        } 
	          
	        catch(IOException ex) 
	        { 
	            System.out.println("IOException is caught"); 
	        } 
		
		
  
	}
 }
