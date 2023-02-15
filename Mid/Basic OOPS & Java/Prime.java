import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.: ");
        int x = sc.nextInt(), i = 1, div = 2;
        while (div != x) {
            if (x%div == 0) {
                i = 0;
                break;
            }
            else {
                div += 1;
            }
        }
        if (i == 1) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
        sc.close();
    }
}
