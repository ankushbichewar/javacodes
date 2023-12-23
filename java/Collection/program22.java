import java.util.*;

class HashMapDemo3{

	public static void main(String[]args){

		HashMap hm=new HashMap();

		hm.put("Java",".java");
		hm.put("Python",".py");
		hm.put("Dart",".dart");

		System.out.println(hm);

		//get 

		System.out.println(hm.get("Python"));

		//ketSet

		System.out.println(hm.keySet());

		// entrySet

		System.out.println(hm.entrySet());


	}
}
