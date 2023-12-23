
  // Write a program to count odd digits of the given number

 class Odd{

	 public static void main(String[]ansh){

		 int N=98645398;
		 int count=0;

		 while(N!=0){

			 int rem=N%10;

			 if(rem%2!=0)

				 count++;

			 N=N/10;
		 }
		 System.out.println(count);
	 }
 }
