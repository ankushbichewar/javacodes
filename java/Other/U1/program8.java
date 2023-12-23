import java.util.*;

class Demo8{

	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Number: ");

		int no=sc.nextInt();
		  
		 int d1=no%10;
		 int d2=no/10;

		  System.out.println("Digit 1 "+d1+"\nDigit 2 "+d2);
	}

}
