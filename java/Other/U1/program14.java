import java.util.*;

class Series2{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter S0,V0,a,t ");

		float so=sc.nextFloat();
		float vo=sc.nextFloat();
		float a=sc.nextFloat();
		int t =sc.nextInt();

		 float s=so+vo+0.5f*a;

		System.out.println("t\ts\n1\t"+s);


	for(t=1;t<=100;t+=5){

		s=so+vo+0.5f*a*t*t;
		System.out.println(t+"\t"+s);
	}
	}

}
