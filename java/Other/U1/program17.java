import java.util.*;

class While1{

	public static void main(String[]args){

		int sum=0;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Number");

		int n=sc.nextInt();

		while(n!=0){

			sum+=n%10;

			n/=10;
		}
		System.out.println("Sum : "+sum);
	}
}
