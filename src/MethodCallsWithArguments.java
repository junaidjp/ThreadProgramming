
public class MethodCallsWithArguments {

	
	
	public static void main(String args[]) // Syntax that JVM understands
	{
		System.out.println("I am Mr Z ");
		String teamname="Batch11 team";
		printteamname(teamname);
		printZipCode(75023);
		printAllDetails(teamname,75023);
		
		
	}
	

	
	



	private static void printAllDetails(String teamname, int anth) 
	{
		
		
		
		
	}



	private static void printteamname(String duncan) {

		System.out.println(duncan);
		
		
	}

	
	private static void printZipCode(int zip) { 
		System.out.println(zip);
	}
	

	public static void printEducation() // My own methods
	{
		System.out.println("Phd - Computer Science");
		
	}
	
	public static void printhobbies() // My own Methods
	{
		System.out.println("Java , Cricket ,Long drives ");
	}

	
	public static void printFavouriteFood()
	{
		System.out.println("Injera,Sushi");
	
		
	}
}
