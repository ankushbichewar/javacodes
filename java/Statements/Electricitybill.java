  
  // Electricity bill program
  // Given an integer input A which represent units of electicity consumed at your house
  //
  //  units <=100 : price per unit 1
  //  units >100  : price per unit 2
    
    class Electricity{

	    public static void main(String[]args){

		    int uni=70;
		    int cost1,cost2;


		    if(uni<100){
			    System.out.println(uni);
		    }

		    else if( uni>100){

			    System.out.println(100+(uni-100)*2);
		    }
	    }
    }
