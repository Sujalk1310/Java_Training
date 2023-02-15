import java.lang.*;
import java.util.Scanner;

class Student {
    public static void main(String args[]) {
        Scanner SC=new Scanner(System.in);
        System.out.print("enter name=");
        String name=SC.next();
        System.out.print("enter class");
        String course=SC.next();
        System.out.print("Enter rollno");
        int rollno=SC.nextInt();
        System.out.print("Enter marks");
        float marks=SC.nextFloat();
        System.out.println(name);
        System.out.println(course);
        System.out.println(rollno);
        System.out.println(marks);
        SC.close();
    }
}
 
 