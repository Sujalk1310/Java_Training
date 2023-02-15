import java.util.*;

class FactRec {
    int Fact(int x) {
        if (x == 0)
        return 1;
        return x*Fact(x-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FactRec Obj = new FactRec();
        System.out.println("Enter a no.: ");
        int x = sc.nextInt();
        System.out.println("Factorial: "+Obj.Fact(x));
        sc.close();
    }
}
