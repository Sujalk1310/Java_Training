public class Split {
    public static void main(String[] args) {
        String a = "Hi, How are you?";
        String[] na = a.split(" ");
        for (String nai : na) {
            System.out.println(nai);
        }
    }
}
