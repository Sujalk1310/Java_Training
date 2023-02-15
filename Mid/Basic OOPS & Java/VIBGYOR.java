import java.util.*;

class VIBGYOR {
    public static void main(String[] args) {
        System.out.println("Enter a character (V/I/B/G/Y/O/R): ");
        Scanner sc = new Scanner(System.in);
        char color = sc.next().charAt(0);
        color = Character.toLowerCase(color);
        sc.close();
        switch (color) {
            case 'v' :
                System.out.println("Violet");
                break;
            case 'i' :
                System.out.println("Indigo");
                break;
            case 'b' :
                System.out.println("Blue");
                break;
            case 'g' :
                System.out.println("Green");
                break;
            case 'y' :
                System.out.println("Yellow");
                break;
            case 'o' :
                System.out.println("Orange");
                break;
            case 'r' :
                System.out.println("Red");
                break;
            default :
                System.out.println("!! Invalid Character !!");
                break;
        }
    }
}
