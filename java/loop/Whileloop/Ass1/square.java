// write a program to calcu;lete square of even digits

class Square{

	public static void main(String[]ansh){

		int N=6836806;

		while(N!=0){

			int rem=N%10;

			if(rem%2==0)
			{
		System.out.println(rem*rem);
	}
	N=N/10;
		}
	}
}

