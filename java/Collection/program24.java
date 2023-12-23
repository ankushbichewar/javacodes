import java.util.*;

class Demo{

        String str;

        Demo(String str){

                this.str=str;
        }
        public String toString(){

                return str;
        }
        public void finalize(){

                System.out.println("Notify");
        }
}
class WeakHashMapDemo4{

        public static void main(String[]args){

                Demo obj1=new Demo("SSC");
                Demo obj2=new Demo("HSC");
                Demo obj3=new Demo("BE");

		WeakHashMap hm=new WeakHashMap();

		hm.put(obj1,2019);
		hm.put(obj2,2021);
		hm.put(obj3,2025);

		obj1=null;
		System.gc();

		System.out.println(hm);
	}
}


