package basicprograms;

public class school {
	int code=30;
	school(){
		this.code=code;
		}
	void show() {
		System.out.println("code of my school is "+ code);
	}
	
	public static void main(String[] args) {
		school s= new school();
		name n=new name();
		s.show();
		n.show();
	}

}

class name {
	name(){
		
	}
	
	void show() {
		System.out.println("My name is Anmol");
	}
}
