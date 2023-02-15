public class test {
    static void combinationUtil(int arr[], int data[], int start, int end, int index, int r, int fin) {
        if (index == r) {
            int sum = 1;
            for (int j=0; j<r; j++)
                sum *= data[j];
                if (sum > fin) {
                    fin = sum;
                }
                System.out.println(fin);
            return;
        }
        for (int i=start; i<=end && end-i+1 >= r-index; i++) {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r, fin);
        }
    }
    static void printCombination(int arr[], int n, int r, int fin) {
        int data[]=new int[r];
        combinationUtil(arr, data, 0, n-1, 0, r, fin);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int r = 3;
        int n = arr.length;
        int fin = 1;
        printCombination(arr, n, r, fin);
    }
}
