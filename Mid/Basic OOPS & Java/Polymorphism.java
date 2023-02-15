import java.lang.*;

class Rectangle{
    int L, W;
    Rectangle(){ // Constructor Overloading
        L = 0;   // Here by default this function will execute everytime an object is called !!
        W = 0;
    }
    Rectangle(int X, int Y){ // If parameterized constructor is called it will first go to default constructor then through parameterized constructor...
        L = X;
        W = Y;
    }
    int rectarea(){
        return (L * W);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Rectangle S = new Rectangle(10, 20);
        System.out.println(S.rectarea());
    }
}

// Polymorphism ---> Many + Forms
// Polymorphism Types ---> Static (Compile-Time) and Dynamic (Run-Time)
// Static ---> Constructor Overloading and Method Overloading

