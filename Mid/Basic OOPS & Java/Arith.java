import java.lang.*;

class Arith {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("Sum = " + (a + b));
        System.out.println("Sub = " + (a - b));
        System.out.println("Mul = " + (a * b));
        System.out.println("Div = " + (a / b));
    }
}

