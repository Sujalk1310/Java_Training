import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int x = sc.nextInt();
        int flag = 1;
        for (int i = 2; i < x; i++) {
            if (x%i == 0) {
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("No. is Prime");
        }
        else {
            System.out.println("No. is Composite");
        }
        sc.close();
    }
}