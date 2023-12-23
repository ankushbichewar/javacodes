class MyThread implements Runnable{

	public void run(){

		System.out.println("In Run");

		System.out.println(Thread.currentThread().getName());

	}
}
class ThreadDEmo{

	public static void main(String[]args){

		MyThread obj=new MyThread();
		Thread t=new Thread(obj);
		t.start();

		System.out.println(Thread.currentThread().getName());
	}
}

// Exception is here
