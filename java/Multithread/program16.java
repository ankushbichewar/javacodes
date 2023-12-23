import java.util.concurrent.*;

class MyThread implements Runnable{

	int num;
	MyThread(int num){

		this.num=num;
	}

        public void run(){

                        System.out.println(Thread.currentThread() +"Start Thread"+ num);
			System.out.println(Thread.currentThread() +"End Thread"+ num);

	}
	void dailytask(){

                        try{

                                Thread.sleep(5000);
                        }
                        catch(Exception obj){
			}
	}
}
class ThreadpoolDemo{

        public static void main(String[]args){

		ExecutorService ser=Executors.newCachedThreadPool();

		for(int i=1;i<=6;i++){
			MyThread obj1=new MyThread(i);
			ser.execute(obj1);
		}
		ser.shutdown();
        }
}
