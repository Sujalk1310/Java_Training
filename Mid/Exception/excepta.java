import java.lang.Exception;

class MyExc extends Exception {
    public MyExc(String s) {
        super(s);
    }
}

class excepta {
    public static void main(String[] args) {
        try {
            throw new MyExc("Hi There!");
        }
        catch (MyExc e) {
            System.out.println(e.getMessage());
        }
    }
}