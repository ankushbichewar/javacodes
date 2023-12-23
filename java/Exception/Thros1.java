import java.util.*;

class DataOverFlowException extends RuntimeException{

	DataOverFlowException(String str){

	
	}
}

class DataUnderFlowException extends RuntimeException{

        DataUnderFlowException(String str){

               
        }
}

class ArrayDemo{

	public static void main(String[]args){

		int arr[]=new int[5];

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter integer value");
		System.out.println("Note: 0< element <100");

		for(int i=0;i< arr.length; i++){

			int data=sc.nextInt();

			if(data<0){

				throw new DataUnderFlowException("Data is less than 0");
			}

			if(data>100){

				throw new DataOverFlowException("Data is Greter than 100");

			}

			arr[i]=data;
		}

		for(int i=0; i<arr.length; i++){

			System.out.println(arr[i]+" ");

		}
	}
}
