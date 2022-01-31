package basicprograms;

public class threading {
   public static void main(String[] args) {
	   boy b=new boy();
	   girl g=new girl();
	   b.start();
	   g.start();
}
}

class boy extends Thread{
	public void run() {
		for(int i=0;i<4;i++) {
		 for(int j=i;j<4;j++) {
			 System.out.print("*");
		 }
		 System.out.println();
		}
	}
	
}

class girl extends Thread{
	public void run() {
		for(int i=0;i<=4;i++) {
		 for(int j=0;j<i;j++) {
			 System.out.print("*");
		 }
		 System.out.println();
		}
	}
}
