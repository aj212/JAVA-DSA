package basicprograms;

public class computer {
   int windows=10;
	computer() {
		this.windows=windows;
	    System.out.println("Constructor of Computer class with windows "+ windows);
	  }
	 
	  void show() {
	    System.out.println("My computer has a window OS");
	  }
	 
	  public static void main(String[] args) {
	    computer c = new computer();
	    Laptop l = new Laptop();
	   
	    c.show();
	    l.show();
	  }
	}
	class Laptop {
	  Laptop() {
	    System.out.println("Constructor of Laptop class.");
	  }
	 
	  void show() {
	    System.out.println("My laptop has ubuntu");
	  }
	}
