import java.util.*;

class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int x = sc.nextInt();
        int n1 = 0, n2 = 1,n3 = 0, c = 0;
        while (c != x) {
            System.out.print(n1+" ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            c += 1;
        }
        sc.close();
    }
}
