// Armstrong numbers

   class Armstrong{
	   
	   public static void main(String[] args){
		   int N=153;
		   int temp= N;
		   int temp2= N;
		   int count= 0;
		   int sum=0; 
		    
		   while(N!=0){
			   count++;
			   N=N/10;
		   }
           while(temp!=0){
		   int Mul=1;
		   int rem=temp%10 ;
		   for (int i=1; i<=count;i++){
			   Mul=Mul*rem;
		   }
		   sum=sum+ Mul;
		   temp=temp/10;
	   }
	   if(temp2==sum)
		   System.out.println(temp2+"is Armstong No.");
	   else
		   System.out.println(temp2+"is not Armstrong No.");
	   }
   }			   
