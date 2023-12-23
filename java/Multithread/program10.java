class MyThread extends Thread{

	public void run(){

		System.out.println(Thread.currentThread().getName());
	}
}

class ThreadDemo{

	public static void main(String[]args){

		MyThread obj=new MyThread();
		obj.start();

		obj.yield();

		System.out.println(Thread.currentThread().getName());
	}
}
