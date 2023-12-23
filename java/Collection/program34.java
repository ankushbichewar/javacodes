import java.util.*;

class NavigableSetDemo{

	public static void main(String[]args){

		NavigableSet ns=new TreeSet();

		ns.add(10);
		ns.add(30);
		ns.add(14);
		ns.add(27);
		ns.add(23);

		System.out.println(ns);

		System.out.println(ns.lower(23)); 	//14
     
		System.out.println(ns.floor(23));       //23

		System.out.println(ns.ceiling(25));     //27

		System.out.println(ns.higher(27));      //30


		//System.out.println(ns.pollFirst());
		//System.out.println(ns.pollLast());

		//System.out.println(ns);

		System.out.println(ns.desendingSet());

	}
}
