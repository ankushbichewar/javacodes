import java.util.*;

class Movies implements Comparable{

	String mName=null;
	float rank=0.0f;

	Movies(String mName,float rank){

		this.mName=mName;
		this.rank=rank;
	}

	public int compareTo(Object obj){

		return mName.compareTo((((Movies)obj).mName));
	}
	public String toString(){

	return mName;
	
	}
	
}
class TreeSetDemo{

	public static void main(String[]args){

		TreeSet ts=new TreeSet();

		ts.add(new Movies("Gadar2",1.5f));
		ts.add(new Movies("OMG2",1.25f));
		ts.add(new Movies("Jeiler",3.7f));

			System.out.println(ts);
	}
}

