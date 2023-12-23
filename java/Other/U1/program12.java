import java.util.*;

class Series1{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);

		System.out.println("enter the number");

		int n=sc.nextInt();
		float sum=0;

		for(int i=1;i<=n;i++){

			sum=sum+1.0f/i;

		}

		 System.out.println("Sum is: "+ sum);
	}
}
