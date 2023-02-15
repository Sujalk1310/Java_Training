import java.util.*;
import java.lang.Math;

public class palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int c = (int) Math.log10(num);
        double reverse = 0;
        do {
            int dig = num % 10;
            num = num / 10;
            reverse = reverse + (dig * Math.pow(10, c));
            c--;
        } while (num > 0);
        System.out.println((int) reverse);
    }
}
