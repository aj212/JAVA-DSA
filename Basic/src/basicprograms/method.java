package basicprograms;

public class method {
	public static void main(String[] args) {
		int a=2;
		int b=7;
		System.out.println("values before calling is "+a+" "+b);
		parameter p=new parameter();
		p.func(a, b);
		
	}

}

class parameter{
	public static void func(int m,int n) {
		m=m*2;
		n=n+3;
		System.out.println("values after calling is "+m+" "+n);
	}
}
