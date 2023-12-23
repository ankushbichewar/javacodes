// 1 
// 4  9 
// 16 25 36
// 49 64 81 100

class Number10{

	public static void main(String[]args){

		int N=4;
		int N1=1;

		for(int i=1; i<=N; i++){

			for(int j=1; j<=i; j++){

				 System.out.print(N1*N1 +" ");

				 N1++;
			}
			 System.out.print("\n");
		}
	}
}
