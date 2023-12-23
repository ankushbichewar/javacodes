import java.util.*;

class SortDemo{

	public static void main(String[]args){

		ArrayList al=new ArrayList();

		al.add("Shital");
		al.add("Anshu");
		al.add("Bharti");
		al.add("Abhi");

		System.out.println(al);

		//in List for Sorting use Collection class's 'sort()' method

		Collections.sort(al);

		System.out.println(al);
	}
}
		

