import java.lang.*;
import java.util.Scanner;

public class Float {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Radius : ");
        float radius  = Sc.nextFloat(), area = 0;
        final float pi = 3.1415f;
        area = pi*radius*radius;
        System.out.println("Area of Circle = "+ area);
        Sc.close();
    }
}
