import java.lang.*;
import java.util.Scanner;

class Intro{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        String Name = Sc.next();
        System.out.println("Enter class : ");
        String Course = Sc.next();
        System.out.println("Enter Roll No. : ");
        int Roll = Sc.nextInt();
        System.out.println("Enter Marks : ");
        float Marks = Sc.nextFloat();
        System.out.println("Roll No. : "+ Roll);
        System.out.println("Name : "+ Name);
        System.out.println("Course : "+ Course);
        System.out.println("Marks : "+ Marks);
        Sc.close();
    }
}