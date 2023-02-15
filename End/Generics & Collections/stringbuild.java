import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

class stringbuild {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine()," ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}