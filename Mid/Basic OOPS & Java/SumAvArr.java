class SumAvArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int c = 0, sum = 0;
        for (int i : arr) {
            sum += i;
            c += 1;
        }
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+(sum/c));
    }
}