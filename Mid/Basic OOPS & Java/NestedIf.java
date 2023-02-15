import java.util.*;

class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount: ");
        float amount = sc.nextFloat();
        float disc = 0;
        if (amount >= 20000){
            disc = 0.10f;
        }
        else {
            if (amount >= 10000 && amount < 20000) {
                disc = 0.05f;
            }
            else {
                if (amount >= 5000 && amount < 10000) {
                    disc = 0.02f;
                }
            }
        }
        System.out.println("Net Ammount: "+(amount-(amount*disc)));
        sc.close();
    }
}
