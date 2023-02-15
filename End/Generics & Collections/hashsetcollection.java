import java.util.*;

public class hashsetcollection {
    public static void main(String[] args) {
        HashSet<String> s = new HashSet<String>();
        s.add("Ravi");
        s.add("Vijay");
        s.add("Ravish");
        s.add("Aman");

        Iterator<String> itr = s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
