import java.util.*;

class ArrayListDemo extends ArrayList{

	public static void main(String[]args){

		ArrayListDemo al=new ArrayListDemo();

		//Add elements

		al.add(10);
		al.add(20.5f);
		al.add("Ankush");
		al.add(10);
		al.add(20.5f);

		System.out.println(al);

		// size()

		System.out.println(al.size());

		//boolean Contain(Object)
		
		System.out.println(al.contains("Ankush"));
                System.out.println(al.contains(30));

		//Index of(object)

		System.out.println(al.indexOf(20.5f));

		// Last Index Of(object)

		System.out.println(al.lastIndexOf(20.5f));

		// E get(int)

		System.out.println(al.get(3));

		// E set(int,E)

		System.out.println(al.set(3,"Bichewar"));
		System.out.println(al.get(3));

		//Add all(collection)
		
		ArrayList al2=new ArrayList();

		al2.add("Prasad");
		al2.add("Abhijeet");
		al2.add("Soham");

		al.addAll(al2);
		al.addAll(3,al2);
		System.out.println(al);

		//removeRange(int,int)

		al.removeRange(3,5);
		System.out.println(al);

		//object[] to Array

		Object arr[]=al.toArray();

		 System.out.println(arr);

		 for(Object data:arr){

			  System.out.print(data+" ");
		 }
		  System.out.println();

		  //clear()

		  al.clear();
		  System.out.println(al);
	}
}
