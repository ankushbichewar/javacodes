import java.util.*;

class Fact{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Number");

		int n=sc.nextInt();

		int fact=1;
		
		float sum=0;

		for(int i=1;i<=n;i++){

			fact=fact*i;

			sum=sum+1.0f/fact;
		}

		 System.out.println("Sum is: "+sum);

	}
}
