import java.util.Scanner;

class lcm {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int a = SC.nextInt();
        int b = SC.nextInt();
        int lcm;
        if (a>b){
            lcm = a;
        }
        else {
            lcm = b;
        }
        while(true) {
            if (lcm%a == 0 && lcm%b == 0) {
                System.out.println("LCM: "+lcm);
                break;
            }
            else {
                lcm++;
            }
        }
        SC.close();
    }
}