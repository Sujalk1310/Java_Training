import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        sc.close();
    }
}
