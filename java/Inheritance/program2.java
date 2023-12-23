class Parent{

	Parent(){
		System.out.println("In parent Constructor");
	}
	void ParentProperty(){

		System.out.println("Car,Flat,Gold");

	}
}
class Child extends Parent{

	Child(){

		System.out.println("In Child constrctor");

	}
}
class Client{

	public static void main(String[]args){

		Child obj=new Child();
		obj.ParentProperty();
	}
}
