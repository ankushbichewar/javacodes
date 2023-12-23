import java.io.*;
class Society{

	public static void main(String[]args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

				System.out.println("Enter socity Name:");
				String name=br.readLine();

				System.out.println("Enter Wing");
				char wing=(char)br.read();

				System.out.println("Enter flat No.:");
				int flatNo=Integer.parseInt(br.readLine());

				System.out.println(name);
				System.out.println(wing);
				System.out.println(flatNo);
	}
}		
