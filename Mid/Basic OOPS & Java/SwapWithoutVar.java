class SwapWithoutVar {
    public static void main(String[] args) {
        int a = 2, b = 5;
        // XOR method
        System.out.println("Before Swapping:");
        System.out.println("a = "+a+" b = "+b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swapping:");
        System.out.println("a = "+a+" b = "+b);
        // Arithmetic Method
        System.out.println("Before Swapping:");
        System.out.println("a = "+a+" b = "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping:");
        System.out.println("a = "+a+" b = "+b);
    }
}
