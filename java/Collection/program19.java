import java.util.*;

class HashMapDemo{

	public static void main(String[]args){

		HashSet hs=new HashSet();

		hs.add("Pavan");
		hs.add("Anshu");
		hs.add("Shital");
		hs.add("Kartik");

		System.out.println(hs);

		HashMap hm=new HashMap();

		hm.put("Pavan","Pune");
		hm.put("Anshu","Chandrapur");
		hm.put("Shital","Nanded");
		hm.put("Kartik","Hingoli");

		System.out.println(hm);
	}
}
