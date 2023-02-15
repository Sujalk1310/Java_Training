import java.lang.*;

public class Typecasting {
    public static void main(String[] args) {
        int i = 100;
        // Automatic Type Conversion
        // Integer to Long Type
        long l = i;
        //Automatic Type Conversion
        // long to Float Type
        float f = l;
        // Float to Integer
        // int a = 23.5f; // Will not run !!
        float b = 70.7f;

        // Print and Display commands
        System.out.println("Int value "+ i);
        System.out.println("Long value "+ l);
        System.out.println("Float value "+ f);
        // System.out.println("int value "+ a);
        System.out.println("int value "+ b); // Explicit Typecasting
    }
}
