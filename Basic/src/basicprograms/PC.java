package basicprograms;

import java.util.LinkedList;
import java.util.Queue;

public class PC {
  public static void main(String[] args) {
	Queue q=new LinkedList();
	Producer producer=new Producer(q);
	Consumer consumer=new Consumer(q);
	
	Thread produce=new Thread(producer);
	Thread consume=new Thread(consumer);
	
	produce.start();
	consume.start();
}
  
  
 

}
