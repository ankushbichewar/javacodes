import java.util.*;

class StackDemo8{

        public static void main(String[]args){

                Stack s=new Stack();

                s.push(10);
                s.push(20);
                s.push(30);
                s.push(40);

                System.out.println(s);

		//pop()

		s.pop();
		System.out.println(s);

		//peek()

		System.out.println(s.peek());

		//search

		System.out.println(s.search(30));

	}
}
