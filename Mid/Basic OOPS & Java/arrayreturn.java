public class arrayreturn {
    public static int[] getArray() {
        double sum = 0, avg = 0;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        // returning array
        return arr;
    }
    public static void main(String[] args) {
        int[] arr1 = getArray();
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
