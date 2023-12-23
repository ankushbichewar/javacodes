// Take N as input print whether its prime or not
 
class Perfect{
	public static void main(String[] args) { 
		int N =6;
		int sum=0;
		for(int i=1; i<N;i++){
			if(N%i ==0)
				sum=sum+i;
		}
		if( sum==N)
			System.out.println(N+"is perfect No");
		else
			System.out.println(N+" is Not perfect No");
	}
}
