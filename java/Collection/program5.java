import java.util.*;

class ArrayListDemo{

	public static void main(String[]args){

		ArrayList al=new ArrayList();

		al.add("Anshu");
		al.add("Shital");
		al.add("Ankush");
		al.add("Prasad");
		al.add("Abhi");

		ListIterator cursor=al.listIterator();

		while(cursor.hasNext()){

			System.out.println(cursor.next());

		}
		while(cursor.hasPrevious()){

			System.out.println(cursor.previous());
		}
	}
}
