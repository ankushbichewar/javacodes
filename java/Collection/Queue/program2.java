import java.util.*;

class QueueDemo2{

        public static void main(String[]args){

                Queue que=new LinkedList();

                que.offer(10);
                que.offer(20);
                que.offer(50);
                que.offer(30);
                que.offer(40);

                System.out.println(que);

                que.poll();
                que.remove(); //No suchElement Exception


                System.out.println(que);

		que.offer(80);
                que.offer(90);

		System.out.println(que.peek());
		System.out.println(que.element());  //No suchElement Exception

		System.out.println(que);
        }
}
