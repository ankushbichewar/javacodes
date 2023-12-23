// Givem an integer N print all itd digit 
// Input =6531 
// Output = 1 3 5 6
 class Digit{

	 public static void main(String[]argas){

		 int num=6531;

		 while(num!=0){

			 int rem=num%10;
			 System.out.println(rem);

			 num=num/10;
		 }
	 }
 }
