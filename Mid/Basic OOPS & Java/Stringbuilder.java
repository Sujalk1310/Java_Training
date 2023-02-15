public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        System.out.println(sb.capacity());
        System.out.println(sb);
        sb.append(", My name is Sujal");
        System.out.println(sb.capacity());
        System.out.println(sb.reverse());
    }
}