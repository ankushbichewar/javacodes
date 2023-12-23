class MyThread extends Thread{


	public void run(){

		System.out.println("In Run");

		System.out.println(Thread.currentThread().getName());

	}

	public void Start(){

		System.out.println("In MyThread Start");

		run();
	}
}

class ThreadDemo{

	public static void main(String[]args){

		MyThread obj=new MyThread();
		obj.Start();

		System.out.println(Thread.currentThread().getName());

	}

}

// Only one thraed is here beacause Start method is overrided
