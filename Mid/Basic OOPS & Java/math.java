import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();
        String arr[][] = new String[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.next();
            }
        }  
        int i = 0;
        int j = 0;
        while (k <= s) {
            System.out.println(i+" "+j);
            if (j == n-1) {
                j = 0;
                i += 1;
            }
            if (i == m) {
                break;
            }
            if (arr[i][j].equals(".") == true) {
                s -= 3;
            }
            if (arr[i][j].equals("#") == true) {
                j = 0;
                i += 1;
            }
            if (arr[i][j].equals("*") == true) {
                s += 4;
            }
            j += 1;
        }
        System.out.println(s);
        sc.close();
    }
}