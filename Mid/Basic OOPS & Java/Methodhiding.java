class Animal{
    static void eat() {
        System.out.println("Grass");
    }
}
class Bird extends Animal {
    static void eat() {
        System.out.println("Fruit");
    }
}
public class Methodhiding {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.eat();
        Animal a1= new Bird();
        a1.eat();
    }
}