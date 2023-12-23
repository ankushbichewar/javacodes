// Not a Such element Type Exception

import java.util.*;

class LinkListDemo{

        public static void main(String[]args){

                ArrayList al=new ArrayList();

		al.add("Ankush");
		al.add("Prasad");
		al.add("Abhijit");

		Iterator itr=al.iterator();
		while(itr.hasNext()){

			if("Prasad".equals(itr.next()))
				itr.remove();

			System.out.println(itr.next());
		}
	}
}
