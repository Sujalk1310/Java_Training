//StringBuffer class methods
import java.io.*;
class stringbuffered {
    public static void main(String args[]) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter surname:");
        String sur = br.readLine();
        System.out.print("enter midname:");
        String mid = br.readLine();
        System.out.print("enter lastname:");
        String last = br.readLine();
        sb.append(sur);
        sb.append("  ");
        sb.append(last);
        System.out.println("name=" + sb);
        int n = sur.length();
        sb.insert(n+1, mid);
        System.out.println("Full name= " + sb);
        System.out.println("In reverse= " + sb.reverse());
    }
}

