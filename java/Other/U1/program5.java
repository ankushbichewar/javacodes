import java.util.*;

class Swap{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter two number");

		int a=sc.nextInt();
		int b=sc.nextInt();

		int temp;
		temp=a;
		a=b;
		b=temp;

		System.out.println("after Swaping:\na="+a+"\nb="+b);
	}
}
