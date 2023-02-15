// Java program to check accessibility
// of non - static variables inside
// static methods

class staticvarible1 {

	// declaring variable 'a' as static
	int a = 5;
	static int b = 10;
	// main is also a static type
	public static void main(String args[])
	{

		// accessing value of
		// static variable
		staticvarible1 obj = new staticvarible1();
		System.out.println("non-static variable:"+obj.a);
		System.out.println("static variable:"+b);
	}
}
