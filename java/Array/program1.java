 
  class demo {
	  public static void main (String [] args){
		  int arr[]={10,20,30,40,};

		  System.out.println(arr[0]);
		  System.out.println(arr[1]);
		  System.out.println(arr[2]);
		  System.out.println(arr[3]);
            
		  System.out.print("for loop");
		  
		  for(int i=0; i<4; i++ ){

			  System.out.print(arr[i]);
	
		  }

		  System.out.println("For-Each Loop");

		  for(int x:arr){
			  System.out.println(x);
		  }
	  }
  }
