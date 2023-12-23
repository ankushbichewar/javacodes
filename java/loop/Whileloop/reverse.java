// Given an integer N print reverse it

  class Reverse{

	  public static void main(String[]ansh){

		  int N=163;
		  int rev=0;
		  while(N!=0){

			  int rem=N%10;
			  rev=rev*10+rem;
			  N=N/10;

		  }
		  System.out.println(rev);
	  }
  }
