class MyThread extends Thread{

	MyThread(ThreadGroup tg, String str){

		super(tg,str);
	}

	public void run(){

		System.out.println(Thread.currentThread());

		try{
			Thread.sleep(50000);
		}catch(Exception ie){

			System.out.println( ie.toString());
		}
	}
}
class ThreadGroupDemo{

	public static void main(String[]args)throws Exception{

	ThreadGroup pthreadGP =new ThreadGroup("India");

	MyThread t1=new MyThread(pthreadGP,"Maha");
        MyThread t2=new MyThread(pthreadGP,"Goa");
        
        t1.start();
        t2.start();

	ThreadGroup cthreadGP=new ThreadGroup(pthreadGP,"Maha");

	MyThread t3=new MyThread(cthreadGP,"Mumbai");
	MyThread t4=new MyThread(cthreadGP,"Pune");

	t3.start();
	t4.start();

	System.out.println(pthreadGP.activeCount());
	System.out.println(pthreadGP.activeGroupCount());

	
	
	}
}
