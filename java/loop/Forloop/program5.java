//take N as input count all the factors and print count

   
class Count{
	public static void main ( String[]arg){
		int count=0;
		for(int i=1 ; i<=6; i++){
			if(6%i==0)
				count++;
		}
		System.out.println(count);
	
	}
}
