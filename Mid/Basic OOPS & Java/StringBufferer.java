import java.io.*;

public class StringBufferer {
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        String second = br.readLine();
        sb.append(first);
        sb.append(second);
        System.out.println(sb);
    } 
}
