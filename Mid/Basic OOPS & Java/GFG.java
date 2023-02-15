// Java Program to demonstrate the accessibility
// of static and non-static variables
// by static method

class Student {

	// initialized to zero
	int a;

	// initialized to zero when class is loaded
	// but not for each object created.
	static int b;

	// Constructor
	Student()
	{
		// incrementing static variable b
		b++;
	}

	// method for printing
	void printData()
	{
		System.out.println("Value of a = " + a);
		System.out.println("Value of b = " + b);
	}
}

// Driver class
class GFG {

	// main is a static block
	public static void main(String args[])
	{

		// creating instance
		Student s1 = new Student();

		s1.printData();

		// directly accessing variable 'b'
		// by class name because it is static
		Student.b++;

		s1.printData();
	}
}
