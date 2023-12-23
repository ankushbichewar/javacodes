// A B C D
// A B C 
// A B 
// A

class Number9{

	public static void main(String[]args){

		int N=4;

		for( int i=1; i<=N; i++){

			char ch='A';

			for(int j=N;j<=1; j--){

				 System.out.print(ch++);

			}

			 System.out.print("\n");
		}
	}
}
