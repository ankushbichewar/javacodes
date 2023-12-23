class MyThread implements Runnable{

	public void run(){

			System.out.println(Thread.currentThread());

			try{
			    
				Thread.sleep(5000);
			}
			catch(Exception obj){
				System.out.println(obj.toString());
			}
	}
}
class ThreadGroupDemo{

	public static void main(String[]args)throws Exception{

		ThreadGroup pthreadGP=new ThreadGroup("Collages");

		MyThread obj1=new MyThread();
		MyThread obj2=new MyThread();

		Thread t1=new Thread(pthreadGP,obj1,"SITS");
		Thread t2=new Thread(pthreadGP,obj2,"SGGS");

		t1.start();
		t2.start();

		System.out.println(pthreadGP.activeCount());
		System.out.println(pthreadGP.activeGroupCount());
	}
}




	
