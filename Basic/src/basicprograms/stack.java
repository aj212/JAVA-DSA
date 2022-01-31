package basicprograms;

public class stack {
   public static void main(String[] args) {
	implement i=new implement();
	if(!i.isFull()) {
		i.push(50);
		i.push(20);
		i.push(30);
		i.push(70);
	}
	System.out.println(i.pop());
	System.out.println(i.pop());
	System.out.println(i.top());
}
}

class implement{
	private int[] stack;
    private int top;
    private int size;
    
    public implement() {
    	top=-1;
    	size=20;
    	stack=new int [20];  
    }
    public implement(int size) {
    	top=-1;
    	this.size=size;
    	stack=new int [size];  
    }
    
    public boolean push(int item) {
    	if(!isFull()) {
    		top++;
        	stack[top]=item;
        	return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public int pop() {
    	return stack[top--];
    }
    
    public boolean isEmpty() {
    	return (top== -1);
    }
    
    public boolean isFull() {
    	return (top==stack.length - 1);
    }
    
    public int top() {
    	return stack[top];
    }
}


