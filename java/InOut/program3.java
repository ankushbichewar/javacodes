import java.io.*;

class PlayerInfo{

	public static void main(String[]args)throws IOException{

		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.println("Enter Player Name:");
		String name=br.readLine();

		System.out.println("Enter Jersy No.:");
		int jerNo=Integer.parseInt(br.readLine());

		System.out.println("Enter Avg:");
		float Avg=Float.parseFloat(br.readLine());

		System.out.println(name);
		System.out.println(jerNo);
		System.out.println(Avg);
	}
}
