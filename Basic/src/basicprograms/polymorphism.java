package basicprograms;

interface college{
	String collegename="HMRITM";
	int code= 10;
	
	default void print() {
		System.out.println("The name of my college is "+ collegename + "and the code is "+code);
	}

	
}

class faculty implements college{
	String faculty="CSE";
	
	public void print() {
		System.out.println("The name of my college is "+collegename+" and i am a part of "+faculty+" faculty");
	}
	
		
}

class student implements college{
	String name="Anmol";
	String stream="CSE";
	
	public void print() {
		System.out.println("The name of my college is "+collegename+" and my name is "+name+" having "+stream+" stream");
	}
}

public class polymorphism {
 public static void main(String[] args) {
	college c= new college() {
		////////object created of interface college...
	};

	college cl= new faculty();
	cl.print();
	college co= new student();
	co.print();
}
}

