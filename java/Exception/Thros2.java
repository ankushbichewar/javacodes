import java.io.*;

class DataOverFlowException extends RuntimeException{

        DataOverFlowException(String str){


        }
}

class DataUnderFlowException extends RuntimeException{

        DataUnderFlowException(String str){


        }
}

class ArrayDemo{

        public static void main(String[]args)throws IOException{

                int arr[]=new int[5];

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter integer value");
                System.out.println("Note: 0< element <100");

                for(int i=0;i< arr.length; i++){

                        
			
				 int data=Integer.parseInt(br.readLine());

                      try{
			      if(data<0){

                                throw new DataUnderFlowException("Data is less than 0");
				
                        }
		

                        if(data>100){

                                throw new DataOverFlowException("Data is Greter than 100");
			
                        }

		      }catch(Exception obj1){

			      System.out.println("Data is Greater than:100 or Less than:0 ");
			      return;
		      }
		      


                         arr[i]=data;
                }

                for(int i=0; i<arr.length; i++){

                        System.out.print(arr[i]+" ");

                }
        }
}
