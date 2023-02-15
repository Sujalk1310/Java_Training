// Default Interface
interface Drawable {
    void Draw();
    default void msg() {
        System.out.println("Default Method");
    }
}

class Rectangle implements Drawable {
    public void Draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class InterfaceClass {
    public static void main(String[] args) {
        Rectangle d = new Rectangle();
        d.Draw();
        d.msg();
    }
}
