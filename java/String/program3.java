// Identity Hash Code of string 


   class StringDemo{
	   public static void main( String []args){

		   String str1= "PRASAD";
		   String str2= "ANKUSH";
          
           System.out.println( str1 + str2 );

		   String str3 ="PRASADANKUSH";
     
	        String str4 = str1 + str2 ;

		   System.out.println(System.identityHashCode(str3));
		   System.out.println(System.identityHashCode(str4));
	   }
   }
