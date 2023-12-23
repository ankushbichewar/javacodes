// write a program to check whether number is Palindrome or not

 class Rverse{

	 public static void main(String[]ansh){

		 int N=749736;
		 int N2=N;
		 int rev=0;

		 while(N!=0){

			 int rem=N%10;
			 rev = rev *10+rem;
			 N=N/10;
		 }
		 if(N2==rev)
		 {
			 System.out.println("number is palindrom");
		 }
		 else
		 {
			 System.out.println("number is palindrom");
		 }
	 }
 }
