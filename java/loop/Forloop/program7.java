// Take N as input. print whether its prime or not
 
class Prime {
	public static void main(String[] args){
		int N=5;
		int count=0;
		for(int i=1;i<=5;i++){

			if(N%i==0)
				count++;
		}
		if(count==2)
			System.out.println(N+"is prime ");
		else
			System.out.println(N+"is not prime");
	}
}

