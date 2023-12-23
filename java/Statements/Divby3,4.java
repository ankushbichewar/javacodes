
   // Given an integer value as input and print fizz if it is divisible by 3 , peint buzz if it is divisibal by 5 , print fizz-buzz if it is divisibale by both , if not then print "not divisible by both"



   class A{

	   public static void main(String[]kg){

		   int x=15;

		   if(x%3==0 && x%5==0){

			   System.out.println("fizz-buzz");
		   }
		   else if(x%3==0){

			   System.out.println("fizz");
		   }

		   else if(x%5==0){

			   System.out.println("buzz");
		   }

		   else{

			   System.out.println("Not divisibale by both");
		   }
	   }
   }
