// A 1 B 2
// C 3 D 2
// E 5 F 6

class Number5{

	public static void main(String[]args){

		int N=1;
		char ch='A';

		 for(int i=1; i<=3;i++){

			 for(int j=1; j<=4; j++){

				 if(j%2!=0)

					 System.out.print(" "+ ch++);
				 else
					 System.out.print(" "+ N++);
			 }
		 System.out.print("\n");
		 }
	}
}
