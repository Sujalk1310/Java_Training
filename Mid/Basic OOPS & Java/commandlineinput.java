public class commandlineinput {
    public static void main(String[] args) {
        int i = 0;
        while (i < args.length) {
            System.out.println(i+" "+args[i]);
            i++;
        }
    }
}
