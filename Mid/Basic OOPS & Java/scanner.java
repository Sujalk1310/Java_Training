import java.util.*;

class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name:");
        String studName = sc.nextLine();
        System.out.println("Enter student section:");
        char studSec = sc.next().charAt(0);
        System.out.println("Enter student's mobile no.:");
        String Mob = sc.next();
        System.out.println("Student Name : "+studName);
        System.out.println("Student Section : "+studSec);
        System.out.println("Student Mobile No. : "+Mob);
        sc.close();
    }
}
