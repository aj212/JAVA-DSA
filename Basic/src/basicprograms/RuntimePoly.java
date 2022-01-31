package basicprograms;

public class RuntimePoly {
	
public static void main(String[] args) {
		child c1=new child1();
		child c2=new child2();
		
		c1.show();
		c2.show();
	}
}

class child{
	public void show() {
		System.out.println("Hello...This is super class");
	}
}

class child1 extends child{
	public void show() {
		System.out.println("Hello...This is class child1");
	}
}

class child2 extends child{
	public void show() {
		System.out.println("Hello...This is class child2");
	}
}


