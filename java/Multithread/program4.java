class Demo extends Thread{

	public void run(){

		System.out.println("Demo:" + Thread.currentThread().getName());

	}
}
class MyThraed extends Thread{

	public void run(){

		System.out.println("MyThread:" + Thread.currentThread().getName());

		Demo obj=new Demo();
		obj.start();
	}
}
class ThreadDemo{

	public static void main(String[]args){

		System.out.println("ThreadDemo:"+ Thread.currentThread().getName());

		MyThread obj1=new MyThread();
		obj1.start();
	}
}
