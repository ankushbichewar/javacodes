import java.util.*;

class IteraterMapDemo{

	public static void main(String[]args){

		SortedMap im=new TreeMap();

		im.put("Ind","India");
                im.put("Pak","Pakistan");
                im.put("SL","Srilanka");
                im.put("Aus","Austria");
                im.put("Ban","Bangaladesh");

		System.out.println(im);

		Set<Map.Entry>data=im.entrySet();
		Iterator<Map.Entry>itr=data.iterator();

		while(itr.hasNext()){

			//System.out.println(String[]args);  or

			Map.Entry abc=itr.next();

			System.out.println(abc.getKey()+":"+abc.getValue());
		}
	}
}
