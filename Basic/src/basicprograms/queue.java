package basicprograms;

public class queue {
  public static void main(String[] args) {
	operation o=new operation();
	o.enqueue(3);
	o.enqueue(8);
	o.enqueue(5);
	o.enqueue(22);
	
	System.out.println(o.dequeue());
	System.out.println(o.dequeue());
}
}

class operation{
	private int[]queue;
	private int size;
	private int total;
	private int front;
	private int rear;
	
	public operation() {
		size=50;
		total=0;
		front=rear=0;
		queue=new int[size];
	}
	
	public operation(int size) {
		this.size=size;
		total=0;
		front=rear=0;
		queue=new int[this.size];
	}
	
	public boolean enqueue(int item) {
		if(isFull()) {
			return false;
		}else {
			total++;
			queue[rear]=item;
			rear=(rear+1)%size;
			return true;
		}
	}
	
	public int dequeue() {
		int item=queue[front];
		total--;
		front=(front+1)%size ;
		return item;
	}
	
	public boolean isFull() {
		if(size==total) {
			return true;
		}else {
			return false;
		}
	}
}	
	
