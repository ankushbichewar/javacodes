class Number13{

	public static void main(String[]ansh){

		int N=4;

		for(int i=1;i<=N;i++){

			for(int j=1;j<=N-i;j++){

				System.out.print(" ");

			}
			for(int j=1;j<=i;j++){

				System.out.print("*");
			}
			  System.out.println(); 
		}


	}

}
