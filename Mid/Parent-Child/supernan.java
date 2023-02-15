class parent {
    parent() {
        System.out.println("Hello");
    }
}

class child extends parent {
    child() {
        super();
        System.out.println("hi");

    }
}

public class supernan {
    public static void main(String args[]) {
        child w = new child();

    }
}
