class Udemy{

	Udemy(){

		System.out.println("Buy any new course");
	}
}
class Cppcourse extends Udemy{

   void	CppCourse(){

		System.out.println("Now I am studing cpp language");

	}
}
class Learner{

	public static void main(String[]args){
		Cppcourse obj=new Cppcourse();
		obj.CppCourse();
	}
}
