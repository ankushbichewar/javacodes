import java.util.*;

class DictionaryDemo2{

	public static void main(String[]args){

          Dictionary ht=new Hashtable();

                ht.put(10,"Sachin");
                ht.put(7,"MSD");
                ht.put(18,"Virat");
                ht.put(1,"KlRahul");
                ht.put(45,"Rohit");

                System.out.println(ht);

		//key

		Enumeration itr1=ht.keys();
		while(itr1.hasMoreElements()){

			System.out.println(itr1.nextElement());
		}
		//elements

		Enumeration itr2=ht.elements();

		while(itr2.hasMoreElements()){

			System.out.println(itr2.nextElement());
		}
		//get

		System.out.println(ht.get(10));

		//Remove

		ht.remove(1);

		System.out.println(ht);
	}
}   
