import java.util.*;

class Platform implements Comparable{

	String str=null;
	int foundyear=0;

	Platform(String str, int foundyear){

		this.str=str;
		this.foundyear=foundyear;

	}

	public String toString(){

		return "{"+str+":"+ foundyear ;
	}
	public int compareTo(Object obj){

		return this.foundyear - ((Platform)obj).foundyear;

	}
}
class TreeMapDemo{

	public static void main(String[]args){

		TreeMap tm=new TreeMap();

		tm.put(new Platform("Youtube",2005),"Google");
		tm.put(new Platform("Instagram",2010),"Meta");
		tm.put(new Platform("Facebook",2004),"Meta");
		tm.put(new Platform("ChatGPT",2022),"OpenAI");

		System.out.println(tm);
	}
}
