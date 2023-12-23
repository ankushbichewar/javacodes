 import java.util.*;

 class SortedSetDemo{

	 public static void main(String[]args){

		 SortedSet ss=new TreeSet();

		 ss.add("Shital");
		 ss.add("Kartik");
		 ss.add("Tushar");
		 ss.add("Ganesh");

		 System.out.println(ss);

		 System.out.println(ss.headSet("Kartik"));
		 System.out.println(ss.tailSet("Kartik"));
		 System.out.println(ss.subSet("Kartik","Tushr"));
		 System.out.println(ss.first());
		 System.out.println(ss.last());
	 }
 }
