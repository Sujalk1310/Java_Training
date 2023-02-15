import java.util.*;

public class stackcollection {
    public static void main(String[] args) {
        Stack<String> s = new Stack<String>();
        s.push("Geeks");
        s.push("For");
        s.push("Geeks");
        s.push("Geeks");

        Iterator<String> itr = s.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
 
        System.out.println();

        s.pop();
        itr = s.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

    }
}
