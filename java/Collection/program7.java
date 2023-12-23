// Indext out of bound Exception


import java.util.*;

class VectorDemo2{

	public static void main(String[]args){

		Vector V=new Vector();

		V.add(10);
		V.add(20);
		V.add(30);
		V.add(40);

		System.out.println(V);

		//Capacity()

		System.out.println(V.capacity());

		//remove(Object)

		V.remove(20);
		V.remove(2);

		System.out.println(V);
	}
}


