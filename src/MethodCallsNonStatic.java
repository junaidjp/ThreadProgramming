//Understanding Static 
public class MethodCallsNonStatic {


	public static void main(String args[])
	{
		System.out.println("I am Junaid ");
		MethodCallsNonStatic tempObject=new MethodCallsNonStatic();//This lines is a very important line
		printDegree();//Method Call
		tempObject.printHobbies();
		tempObject.printFavouriteFood();
		//System.out.println(MethodCalls.companyname());
		///MethodCalls methodcalls = new MethodCalls();
		//methodcalls.creadt
		
	}
	
	
	
	public  static void printDegree()
	{
		System.out.println("Phd - Computer Science");
		
	}
	
	public  void printHobbies()
	{
		
		System.out.println("Java , Cricket ,Long drives ");
	}

	
	public  void printFavouriteFood()
	{
		System.out.println("Injera,Sushi");
	
		
	}
	
	
	

	
}
