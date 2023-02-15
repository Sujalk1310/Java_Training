interface Printable {
    void print();
}

interface showable extends Printable {
    void show();
}

class InheritedInterface implements showable {
    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        InheritedInterface obj = new InheritedInterface();
        obj.print();
        obj.show();
    }
}
