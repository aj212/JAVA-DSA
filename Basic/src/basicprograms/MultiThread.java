package basicprograms;
//import java.lang.*;

	public class MultiThread extends Thread 
	{ 
	    public void run() 
	    { 
	        for (int i=0; i<5 ; i++) 
	            System.out.println(Thread.currentThread().getName() 
	                                + " in control"); 
			 try
	            { 
	               
	                Thread.sleep(1000); 
	            } 
	  
	            catch (Exception e) 
	            { 
	                System.out.println(e); 
	            } 

	    } 
	} 

	class ThreadA extends Thread{
	    public void run() 
	    { 
	        for (int i=0; i<5 ; i++) 
	            System.out.println(Thread.currentThread().getName() 
	                                + " in control"); 
			 try
	            { 
	                // thread to sleep for 1000 milliseconds 
	                Thread.sleep(1000); 
	            } 
	  
	            catch (Exception e) 
	            { 
	                System.out.println(e); 
	            } 

	    } }

	class ThreadB extends Thread {
	        public void run() 
	    { 
	        for (int i=0; i<5 ; i++) 
	            System.out.println(Thread.currentThread().getName() 
	                                + " in control"); 
	    } }
	class ThreadC extends Thread{
	    public void run() 
	    { 
	        for (int i=0; i<5 ; i++) 
	            System.out.println(Thread.currentThread().getName() 
	                                + " in control"); 
	    } }
	
	class ThreadD extends Thread{
	    public void run() 
	    { 
	        for (int i=0; i<5 ; i++) 
	            System.out.println(Thread.currentThread().getName() 
	                                + " in control"); 
	    } }

	  
	// Driver Class 
	 class Main
	{ 
	    public static void main(String[]args) 
	    { 
	        MultiThread t = new MultiThread(); 
	       	       ThreadA a = new ThreadA();
	        	   ThreadB b = new ThreadB();
	        	   ThreadC c = new ThreadC();
	        	   ThreadD d = new ThreadD();
	        	   a.start();
	      	       b.start();
	        	   c.start();
	        	   d.start();
	               t.start(); 
	  
	        for (int i=0; i<5; i++) 
	        { 
	           
	            Thread.yield(); 
	  
	            System.out.println(Thread.currentThread().getName() 
	                                + " in control"); 
	        } 
	    } 
	}

