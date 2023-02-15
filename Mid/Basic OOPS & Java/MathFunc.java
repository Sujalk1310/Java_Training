import java.lang.Math;
class MathFunc {
    public static void main(String[] args) {
        int x = 28;
        int y = 4;
        System.out.println("X: "+x+" Y: "+y);
        System.out.println("Maximum No: "+Math.max(x,y)); // returns max of two numbers
        System.out.println("Square root of y: "+Math.sqrt(y)); // returns Square Root of passed var
        System.out.println("X to the power Y: "+Math.pow(x,y)); // returns x to the power y
        System.out.println("Logarithm of x: "+Math.log(x)); // return log(base-e) value
        System.out.println("Logarithm of y: "+Math.log10(y)); // return log(base-10) value
        System.out.println("Log of x+1: "+Math.log1p(x)); // returns loge(1+x)
        System.out.println("2 to the power of y: "+Math.exp(y)); // returns the power of 2 for x
        System.out.println("Matrix Exponential of y: "+Math.expm1(y)); //returns ((power of 2 for x) - 1)
        double a = 30;
        System.out.println("Radian value of a: "+Math.toRadians(a)); // returns Radian value
        System.out.println("Sine Value of a: "+Math.sin(a)); // returns sin value
        System.out.println("Cosine Value of a: "+Math.cos(a)); // return cos value
        System.out.println("Tangent Value of a: "+Math.tan(a)); // return tan value
        // for arc values we can use Math.asin(), Math.acos(), Math.atan()
        // for hyperbolic values we can use Math.sinh(), Math.cosh(), Math.tanh()
        // Othe methods --> https://www.javatpoint.com/java-math
    }
}
