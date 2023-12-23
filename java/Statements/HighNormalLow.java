
//  Given the tempreture of person in farhehet
//  print whither the person has High, Normal, Low temp.

//   >98.6   High
//    98.0<= and <=98.6  Normal
//   <98.0    Low

   class TempDemo{

	   public static void main(String[]asd){

		   float temp=98.1f;

		if(temp>98.6f){

			System.out.println("Temp is High");
		}

		else if(temp<=98.0f && temp >=98.6f){

			System.out.println("Temp is Normal");

		}

		else{
			System.out.println("Temp is normal");
		
		}
	   }
   }
