class Asymptotics{

	public static void main(String[]ansh){

		int N=789;
		int rev1=0;
		int rev2=0;
		int temp=N;
		int sqr=N*N;

		while(N!=0){

			int rem1=N%10;
			rev1=rev1*10+rem1;

			int rem2= sqr%10;
			rev2=rev2*10+rem2;

			N=N/10;
			sqr = sqr/10;

		}

		if(rev1==rev2)

			System.out.println("Asymptotic No.");
		else

			System.out.println("No Asymptotic No.");
	}
}
