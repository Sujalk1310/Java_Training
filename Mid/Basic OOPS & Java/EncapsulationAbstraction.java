import java.lang.*;

// WORM - Write Once Read Many

class Rectangle{
    int Length, Breadth;
    void getData(int x, int y){
        Length = x;
        Breadth = y;
    }
    int rectArea(){
        int Area = Length * Breadth;
        return Area;
    }
}
// class Rectangle closed
// Data Binding or Data Encapsulation

class EncapsulationAbstraction{
    public static void main(String[] args) {
        Rectangle S =  new Rectangle(); // Data Hiding or Data Abstraction
        S.Length = 23;
        S.Breadth = 20;
        int Cal = S.Length * S.Breadth;
        System.out.println("Area of rectangle using data members : "+ Cal);
        Rectangle R = new Rectangle();
        R.getData(10,2);
        System.out.println("Area of rectangle using function call : "+ R.rectArea());
    }
    // Main method closed
}