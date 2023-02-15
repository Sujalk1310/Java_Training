
import java.util.Scanner;

public class misssingFind {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0 ;
         int j =0;
        int k=sc.nextInt();
        int sum = 0 ;
        float ans = 0;

        while(j<k){
           
            sum+=arr[j];
            j++;
        }
        float avg =(float) sum/k;
        ans=avg>ans?avg:ans;

        while(j<arr.length){
            sum-=arr[i];
            i++;
            sum+=arr[j];
            avg = (float)sum/k;
            ans=avg>ans?avg:ans;
            j++;
        }

        System.out.println(ans);
        sc.close();
    }
}




