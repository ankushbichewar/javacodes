import java.util.*;

class MyClass implements Comparable{

	String str=null;


	MyClass(String str){

		this.str=str;
	}
	public int CompareTo(){

		return 1;
	}
	public String toString(){

		return str;
	}
}
class TreeSetDemo{

	public static void main(String[]args){

		TreeSet ts=new TreeSet();

		ts.add(new MyClass("Kartik"));
		ts.add(new MyClass("Sachin"));
		ts.add(new MyClass("Saurav"));
		ts.add(new MyClass("Vaibhav"));

		System.out.println(ts);
	}
}
