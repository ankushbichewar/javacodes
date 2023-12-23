class MyThread extends Thread{

	MyThread(ThreadGroup tg, String str){

		super(tg, str);
	}
	public void run(){

		System.out.println(Thread.currentThread());
	}
} 
class ThreadGroupDemo{

	public static void main(String[]args){

		ThreadGroup pthreadgp=new ThreadGroup("Collage");

		MyThread obj1=new MyThread(pthreadgp,"Class A");
		MyThread obj2=new MyThread(pthreadgp,"Class B");
		MyThread obj3=new MyThread(pthreadgp,"Class C");

		obj1.start();
		obj2.start();
		obj3.start();

		ThreadGroup qthreadgp=new ThreadGroup("School");

		MyThread obj4=new MyThread(qthreadgp,"Div A");
                MyThread obj5=new MyThread(qthreadgp,"Div B");
                MyThread obj6=new MyThread(qthreadgp,"Div C");

                obj4.start();
                obj5.start();
                obj6.start();
	}
}
