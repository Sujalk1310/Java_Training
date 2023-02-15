import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n= sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int max = ar[0];
        int min = ar[0];
        for (int i = 0; i < n; i++) {
            if(max<=ar[i]){
                max = ar[i];
            }
            if(min>=ar[i]){
                min = ar[i];
            }
        }
        System.out.println("max="+max);
        System.out.println("m="+min);
        
    }
}
