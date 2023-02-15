import java.util.Scanner;

public class RightRotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int first = arr[arr.length-1];
            for (int j = arr.length-1; j > 0; j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = first;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
        sc.close();
    }
}
