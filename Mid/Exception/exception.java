class exception {
    public static void main(String args[]) {
        int a[] = { 5, 10 };
        int b = 5, x = 0;
        try {
            x = a[1] / (b - a[2]);
        } catch (ArithmeticException e) {
            System.out.println("Divison by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array index error");
        } catch (ArrayStoreException e) {
            System.out.println("Wrong data type");
        } finally {
            int y = a[1] / a[0];
            System.out.println("y = " + y);
            System.out.println("x =" + x);
        }
    }
}