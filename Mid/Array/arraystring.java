//string array
class arraystring {

    public static void main(String[] args) 
{
        String[] fruits = { "Apple", "Banana", "Orange" };
        fruits[1] = "Grapes"; // changing value of 2nd element (having index 1)

        System.out.println("First element: " + fruits[0]);
        System.out.println("Second element: " + fruits[1]);
        System.out.println("Third element: " + fruits[2]);
    }
}