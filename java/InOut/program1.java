import java.util.Scanner;

class DreamCompany{

	public static void main(String[]args){

		System.out.println("Enter Your Dream Company Name");

		Scanner obj=new Scanner(System.in);
		String company=obj.next();
		
		System.out.println("Enter your Package:");
		
		float Package=obj.nextFloat();
	
		System.out.println(company);
		System.out.println(Package);
	}
}
