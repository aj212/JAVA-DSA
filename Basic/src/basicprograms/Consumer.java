//package basicprograms;
//
//import java.util.Queue;
//
//
//public class Consumer implements Runnable {
//
//	private Queue<Integer>q;
//	
//	public Consumer(Queue<Integer>q) {
//		this.q=q;
//	}
//	public void run() {
//		while(true) {
//			synchronized(q) {
//				while(q.isEmpty()) {
//					try {
//						System.out.println("Consumer is waiting to produce objects by producer");
//						q.wait();
//					} catch (InterruptedException e) {
//						
//						e.printStackTrace();
//					}
//				}==- 
//				
//				int data =q.poll();
//				q.add(data);
//				System.out.println("Consumed:"+ data);
//				q.notify();
//			}
//		}
//	}
//
//}
