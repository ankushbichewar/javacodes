 
// Given an integer N print sum of its digits

 class Sum_digit{

	 public static void main(String[]ad){

		 int sum=0;
		 int N=6531;
		 while(N!=0){

			 int rem=N%10;
			 sum=sum + rem;
			 N=N/10;
		 }
		 System.out.println(sum);
	 }
 }
