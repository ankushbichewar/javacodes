import java.util.*;

class Demo7{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);

		 System.out.println(" Enter two number : ");

		 int a=sc.nextInt();
		 int b=sc.nextInt();

		  System.out.println("After ANDing: "+(a&b)+"\nAfter EXORing: "+(a^b)+"\nNOT of a: "+(~a)+" \nNOT of b: "+(~b));
	}
}
