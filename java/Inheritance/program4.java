class Parent{

	int x=10;
	static int y=20;
	 
	static{
		System.out.println("parent Static block");
	}
	Parent(){

		System.out.println("Parent Constructor");
	}
	void MethodOne(){

		System.out.println(x);
		System.out.println(y);
	}
	static void MethodTwo(){

		System.out.println(y);
	}
}
class Child extends Parent{

	static{
		System.out.println("Child Static block");
	}
	Child(){
		System.out.println("Child Constructor");
	}
}
class Client{

	public static void main(String[]args){

		Child obj=new Child();

		obj.MethodOne();
		obj.MethodTwo();
	}
}
