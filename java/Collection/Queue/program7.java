// Producer Consumer Problem

import java.util.concurrent.*;

class Producer implements Runnable{

	BlockingQueue bQueue;
	
	Producer(BlockingQueue bQueue){

		this.bQueue=bQueue;
	}
	public void run(){
		for(int i=1;i<=10;i++){

			try{
				bQueue.put(i);
				System.out.println("Producer: "+i);

			}catch(InterruptedException ie){

			}
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){

			}
		}
	}
}
class Consumer implements Runnable{

        BlockingQueue bQueue;

        Consumer(BlockingQueue bQueue){

                this.bQueue=bQueue;
        }
        public void run(){
                for(int i=1;i<=10;i++){

                        try{
                                bQueue.take();
                                System.out.println("Consumer: "+i);

                        }catch(InterruptedException ie){

                        }
                        try{
                                Thread.sleep(7000);
                        }catch(InterruptedException ie){

                        }
                }
        }
}
class ProducerConsumer {

	public static void main(String[]args){

		BlockingQueue bQueue=new ArrayBlockingQueue(3);
		
		Producer p1=new Producer(bQueue);
		Consumer c1=new Consumer(bQueue);
		 
		Thread produserThread=new Thread(p1);
		Thread consumerThread=new Thread(c1);

		produserThread.start();
		consumerThread.start();
	}
}
