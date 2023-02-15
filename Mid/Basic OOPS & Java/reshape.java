import java.util.Scanner;

public class reshape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MR = sc.nextInt();
        int MC = sc.nextInt();
        int arr[][] = new int[MR][MC];
        for (int i = 0; i < MR; i++) {
            for (int j = 0; j < MC; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int FR = sc.nextInt();
        int FC = sc.nextInt();
        int I = 0;
        int J = 0;
        int fArr[][] = new int[FR][FC];
        for (int i = 0; i < MR; i++){
            for (int j = 0; j < MC; j++) {
                fArr[I][J] = arr[i][j];
                J++;
                if (J == FC) {
                    J = 0;
                    I += 1;
                }
            }
        }
        for (int i = 0; i < FR; i++) {
            for (int j = 0; j < FC; j++) {
                System.out.print(fArr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
