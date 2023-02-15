public class Pyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (2*i)-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
// Your Fault - Excision
// Is this what you want is this what you need
// Maybe everything isn't what it seems
// All this back and forth makes me wanna scream... Baby !!
// Scream... Baby !!
// Do you feel the rush do you feel the high
// Coming from my touch Feels like paradise
// When you say my name it makes me come alive Baby..
// This is the way that is goes dear..
