import java.util.*;

class Fibonacci{

	public static void main(String[]args){

		int a=0;
		int b=1;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number");

		int n=sc.nextInt();

		for(int i=1;i<=n-2;i++){

			int c=a+b;

			 System.out.println(c);

		a=b;
		b=c;
		}
	}
}
