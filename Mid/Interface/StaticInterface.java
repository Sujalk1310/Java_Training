// Static Interface
interface Drawable {
    void draw();
    static int cube(int x) { 
        return x*x*x;
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class StaticInterface {
    public static void main(String[] args) {
        Drawable d = new Rectangle();
        d.draw();
        System.out.println(Drawable.cube(3));
    }
}
