package basicprograms;

import java.util.Queue;
import java.util.Random;

public class Producer implements Runnable {

	private Queue<Integer>q;
	private final int size=5;
	public Producer(Queue<Integer>q) {
		this.q=q;
	}
	public void run() {
		while(true) {
			synchronized(q) {
				while(q.size()==5) {
					try {
						System.out.println("Producer is waiting to consume objects by consumer");
						q.wait();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
				Random random = new Random();
				int data =random.nextInt(size);
				q.add(data);
				System.out.println("Produced:"+ data);
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
				  e.printStackTrace();
				}
				q.notify();
			}
		}
	}

}
