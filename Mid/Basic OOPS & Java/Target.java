public class Target {
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 13;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i]+arr[j] == target) {
                        System.out.println("["+i+","+j+"]");
                    }
                }
            }
        }
    }
}
