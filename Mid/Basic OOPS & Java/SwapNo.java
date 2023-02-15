// Swap No.
class SwapNo {
    public static void main(String[] args) {
        int x = 5, y = 10;
        System.out.println(x+" "+y);
        x = x^y; // x = x+y or int temp = x
        y = x^y; // y = x-y or x = y
        x = x^y; // x = x-y or y = temp 
        System.out.println(x+" "+y); // a = b+a-(b=a)
    }
}
