class Conversion{

	public static void main(String[]args){

		byte b;
		int i=500;
		float f=123.689f;

		System.out.println("\n Conversion of floate into byte");

		b=(byte)f;

		System.out.println("float was: "+ f +" Integer was: " + b);

		f=(int)i;

		System.out.println("\n Converstion of int into float");

		System.out.println("Integer was: " + i +" Float Was:" + f);

	}
}

