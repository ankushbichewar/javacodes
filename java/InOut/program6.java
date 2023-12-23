import java.util.*;

class Demo{

	void sub(int a,int b){

		int ans=a-b;
		System.out.println(ans);
	}

	void Mul(int a, int b){

		int ans=a*b;
		System.out.println(ans);
	}
	void Div(int a,int b){

		int ans=a%b;
		System.out.println(ans);
	}

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Integer ");

		int a=sc.nextInt();
		int b=sc.nextInt();

		Demo obj=new Demo();

		obj.sub(a,b);
		obj.Mul(a,b);
		obj.Div(a,b);
	}
}


