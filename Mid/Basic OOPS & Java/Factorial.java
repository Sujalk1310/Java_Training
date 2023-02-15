import java.util.*;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int x = sc.nextInt();
        int fact = 1;
        for (int i = x; i > 0; i--){
            fact *= i;
        }
        System.out.println("Factorial: "+fact);
        sc.close();
    }
}
