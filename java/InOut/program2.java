import java.io.*;

class BufferedDemo{

	public static void main(String[]args)throws IOException{

		InputStreamReader isr=new InputStreamReader(System.in);
                BufferedReader br=new BufferedReader(isr);

		System.out.println("Enter the Name");
		String name=br.readLine();

		 System.out.println("Enter Age");
		 int age=Integer.parseInt(br.readLine());

		 System.out.println(name);
		 System.out.println(age);

	}
}		
