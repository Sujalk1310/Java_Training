abstract class Shape {
    abstract void draw();
}

// In real scenario, implementation is provided by others i.e. unknown by end user

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle1 extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

// In real scenario, method is called by programmer or user

public class Abstraction {
    public static void main(String[] args) {
        Shape s;
        s = new Circle1(); // In real scenario, object is provided through method, e.g., getShape() method.
        s.draw();
        s = new Rectangle();
        s.draw();
    }
}
