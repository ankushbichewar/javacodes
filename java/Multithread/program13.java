class MyThread extends Thread{

        public void run(){

                System.out.println(Thread.currentThread().getName());
        }
}

class ThreadDemo{

        public static void main(String[]args)throws Exception{

                MyThread obj=new MyThread();
                obj.start();
                   
	        obj.join(100);	
                 
		obj.sleep(2000);
                System.out.println(Thread.currentThread().getName());
        }
}
