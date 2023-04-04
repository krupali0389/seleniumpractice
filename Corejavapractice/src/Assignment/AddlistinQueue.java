package Assignment;

import java.util.PriorityQueue;
import java.util.Queue;

public class AddlistinQueue {

	public static void main(String[] args) {
		// WAP to add list in to queue
		Queue<Integer>queue=new PriorityQueue<Integer>();
		queue.add(12);
		queue.add(15);
		queue.add(34);
		queue.add(45);
		queue.add(54);
		System.out.println("Elements os queue: "+queue);
		}

}
