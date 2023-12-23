// Methods In Deque

import java.util.*;

class DequeDemo{

        public static void main(String[]args){

                Deque dq =new ArrayDeque();

                dq.offer(10);
                dq.offer(40);
                dq.offer(20);
                dq.offer(60);
                dq.offer(50);

                System.out.println(dq);

		//dq.offerFirst();
                //offerlast();

		dq.offerFirst(5);
		dq.offerLast(50);

		System.out.println(dq);

		//pollFirst()
		//pollLast()

		dq.pollFirst();
		dq.pollLast();

		System.out.println(dq);

		//peakFirst
		//preakLast

		dq.peekFirst();
		dq.peekLast();

		System.out.println(dq);

		//iterator
		 
		Iterator itr=dq.iterator();
		while(itr.hasNext()){

			System.out.println(itr.next());

		}

		//descendingIterator();
		 
		Iterator itr2=dq.descendingIterator();
		while(itr2.hasNext()){

			System.out.println(itr2.next());
		}

        }
}
