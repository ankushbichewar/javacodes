import java.util.*;

class Loan{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Pricipal Amount, No. of yeras, rate of intarest");

		float p=sc.nextFloat();
		float y=sc.nextFloat();
		float r=sc.nextFloat();

		float L=p*y*r/100;

		System.out.println("Simple interest is:"+ L);
	}
}
