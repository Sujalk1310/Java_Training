// Java program to check accessibility
// of non - static variables inside
// static methods

class staticvarible1 {

	// declaring variable 'a' as non - static
	 int a = 5;

	// main is also a static type
	public static void main(String args[])
	{

		// accessing value of
		// non - static variable
		System.out.println("Non - Static variable:" + a);
	}
}
