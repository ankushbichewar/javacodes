//Enumation
//Annoymouns Innner Class


import java.util.*;

class VectorDemo{

	public static void main(String[]args){

		Vector v=new Vector();

		v.add("Anshu");
		v.add("Abhi");
		v.add("Prasad");

		Enumeration cursor=v.elements();

		System.out.println(cursor.getClass().getName());

		while(cursor.hasMoreElements()){

			System.out.println(cursor.nextElement());
		}
	}
}
	
