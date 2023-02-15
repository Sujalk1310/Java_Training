class MatMul {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
        int R1 = arr1.length, C1 = arr1[0].length, R2 = arr2.length, C2 = arr2[0].length;
        int[][] arr3 = new int[R1][C2]; 
        if (C1 == R2) {
            for (int i = 0; i < R1; i++) {
                for (int j = 0; j < C2; j++) {
                    int sum = 0;
                    for (int k = 0; k < C1; k++) {
                        sum += arr1[i][k] * arr2[k][j];
                    }
                    arr3[i][j] = sum; 
                }
            }
            for (int i = 0; i < R1; i++) {
                for (int j = 0; j < C2; j++) {
                    System.out.print(arr3[i][j]+" ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("!! Cannot Multiply !!");
        }
    }
}
