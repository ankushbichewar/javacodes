
 import java.io.*;

 class Number{

	 void getdata() throws IOException{

		 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		 int data=Integer.parseInt(br.readLine());
	 }

	 public static void main(String[]args) throws IOException{

		 Number obj=new Number();
		 obj.getdata();
	 }
 }
