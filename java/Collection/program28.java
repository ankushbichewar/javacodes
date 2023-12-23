import java.util.*;

class TreeMapDemo28{

	public static void main(String[]args){

		SortedMap sm=new TreeMap();

                sm.put("Ind","India");
                sm.put("Pak","Pakistan");
                sm.put("SL","Srilanka");
                sm.put("Aus","Austria");
                sm.put("Ban","Bangaladesh");

		System.out.println(sm);

		//setMap

		System.out.println(sm.subMap("Aus","Pak"));

		//headMap

		System.out.println(sm.headMap("Pak"));

		//tailMap

		System.out.println(sm.tailMap("Pak"));

		//firstKey

		System.out.println(sm.firstKey());

		//lastKey

		System.out.println(sm.lastKey());

		//KeySet
		
		System.out.println(sm.keySet());

		//Values

		System.out.println(sm.values());

		//entrySet

		System.out.println(sm.entrySet());


	}
}
