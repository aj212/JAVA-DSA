package basicprograms;

abstract class task {
	int arr[]= {89,88,90,97,98,67};	
	
	abstract void print_marks(); 
	
class student extends task{
	int total=0;
	void print_marks() {
		for(int i=0;i<arr.length;i++) {
			total=total+arr[i];
			System.out.println(arr[i]+" ");
		}
		System.out.println("Total marks are "+total);
	}	
}
class student1 extends task{
	void print_marks() {
		int total=0;
		int percentage=0;
		for(int i=0;i<arr.length;i++) {
			total=total+arr[i];
		}
		percentage=(total/500)*100;
		if(percentage>35) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}	
}
}