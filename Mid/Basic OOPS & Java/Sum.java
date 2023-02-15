import java.lang.*;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter 1st No. : ");
        int A = Sc.nextInt();
        System.out.println("Enter 2nd No. : ");
        int B = Sc.nextInt();
        System.out.println("Sum : "+ A +" + "+ B +" = "+ (A+B));
        // or
        // int Sum = A+B;
        Sc.close();
    }
}
