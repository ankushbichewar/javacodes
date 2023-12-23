import java.util.*;
import java.io.*;

class PropertiesDemo{

	public static void main(String[]args)throws Exception{

		Properties obj=new Properties();

		FileInputStream fobj=new FileInputStream("friends.properties");

		obj.load(fobj);

		String name=obj.getProperty("Shital");
		System.out.println(name);

		obj.setProperty("Bharti","TCS");

		FileOutputStream outobj=new FileOutputStream("friends.properties");

		obj.store((outobj),"Updated By Bharti");
	}
}
