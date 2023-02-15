public class PrimeFromArr {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 8, 7, 14};
        for (int i = 0; i < arr.length; i++) {
            int flg = 1;
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i]%j == 0) {
                    flg = 0;
                    break;
                }
            }
            if (flg == 1) {
                System.out.println(arr[i]+" is prime");
            }
            else {
                System.out.println(arr[i]+" is composite");
            }
        }
    }
}
