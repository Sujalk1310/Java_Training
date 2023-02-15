import java.util.*;

class productclass{
    private String  pname;
    private int  pid;
    private double pp;
    productclass(String pname , int pid , double pp){
        this.pname = pname;
        this.pid = pid;
        this.pp = pp;

    }

    String get_string(){
        return pname;
    }

    int get_int(){
        return pid;
    }

    double get_double(){
        return pp;
    }


}

public class al {
    public static void main(String[] args) {

        ArrayList l = new ArrayList();
        productclass p = new productclass("harsh", 5, 3.5);
        l.add(p.get_string());
        l.add(p.get_int());
        l.add(p.get_double());

        System.out.println(l);
        
    }
}
