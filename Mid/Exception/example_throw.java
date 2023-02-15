class example_throw {

    static void divide_1() throws ArithmeticException {
        int x = 22, y = 0, z;
        z = x / y;
    }

    public static void main(String args[]) {

        try {
            divide_1();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        }
    }
}