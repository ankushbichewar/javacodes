import java.util.*;

class DQueueDemo{

	public static void main(String[]args){

		Deque dq =new ArrayDeque();

		dq.offer(10);
		dq.offer(40);
		dq.offer(20);
		dq.offer(60);
		dq.offer(50);

		System.out.println(dq);
	}
}
