import java.lang.*;

public class Final {
    public static void main(String[] args) {
        final int a = 10;
        int b = 5;
        System.out.println("Before Changing : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = 5; // Error - It is final keyword (Same as Const) !! 
        b = 10;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("After Changing : ");
    }
}
