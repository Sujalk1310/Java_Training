// Java Program Demonstrating Working of matches() Method
// Pattern class
 
import java.util.regex.Pattern;
 
// Main class
class regularexpression
 {
 
    // Main driver method
    public static void main(String args[])
    {
 
        // Following line prints "true" because the whole
        // text "geeksforgeeks" matches pattern "geeksforge*ks"
        System.out.println(Pattern.matches("geeksforge*ks", "geeksforgeeeeeeks"));
 
        // Following line prints "false" because the whole
        // text "geeksfor" doesn't match pattern "g*geeks*"
        System.out.println(Pattern.matches("geeksgeeks*", "geeksgeeksfor"));
    }
}