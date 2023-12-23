 class Demo{

	 void m1(){

		 System.out.println("In m1");

	 }

	 void m2(){

		 System.out.println("In m2");

	 }

	 public static void main(String[]args){

		 Demo obj=new Demo();
                 
		 System.out.println("Start main");

		 obj.m1();

		 try{
			 obj.m2();
		 }
		 catch(Exception obj5){

		 }
		 finally{

			 System.out.println(" In Finally");

		 }

		 System.out.println("End main");
	 }
 }
