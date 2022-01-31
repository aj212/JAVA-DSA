package basicprograms;

public class overload {
    public static void main(String[] args) {
		volume v=new volume();
		v.volume(4);
		v.volume(2,5,8);
		
	}
}

class volume{
	public static void volume(int a) {
    	int volume= a*a*a;
    	System.out.println("Volume is "+volume);
    }
    
    public static void volume(int l,int b,int h) {
    	int volume=l*b*h;
    	System.out.println("Volume is "+volume);
    }
}