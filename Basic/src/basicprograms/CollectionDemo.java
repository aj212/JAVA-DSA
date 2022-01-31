package basicprograms;

import java.io.*; 
import java.util.*; 
  
class CollectionDemo { 
  
    public static void main(String[] args) 
    { 
        
        int arr[] = new int[] { 1, 2, 3, 4 }; 
        Vector<Integer> vector = new Vector(); 
        Hashtable<Integer, String> hashtable = new Hashtable(); 
  
        
        vector.addElement(1); 
        vector.addElement(2); 
  
       
        hashtable.put(1, "Anmol"); 
        hashtable.put(2, "Joshi"); 
  
       
        System.out.println(arr[1]); 
        System.out.println(vector.elementAt(0)); 
        System.out.print(hashtable.get(1)+ " ");
        System.out.println(hashtable.get(2));
        
  
    } 
} 
