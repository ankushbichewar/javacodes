//Write a program to create an array of n interger element where n values  should be taken from the user 
// insert the values the user  and find the sum of all elenment in the array 


    import java.util.*;
    class sum{
     public static void main(String [] args){
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter size");
	     int n = sc.nextInt();
	     int arr[] = new int[n];
	     System.out.println("Enter array element");
	     int sum = 0;

	     for(int i=0;i<=arr.length;i++){

		     arr[i]=sc.nextInt();
		     sum = sum + arr[i];
	     }
	     System.out.println(sum);
     }
     
     
    }
