// write a program to print the sum of all even Numbers and Multipication of odd numbers between 1 to 10

class SumMulti{

	public static void main(String[]ansh){

		int i=1;
		int sum=0;
		int mul=1;
		
		while(i<=10){

			if(i%2==0)

				sum=sum+i;
			else
				mul=mul*i;

			i++;
		}

		System.out.println(sum);
		 System.out.println(mul);
	}
}
