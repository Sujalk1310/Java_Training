import java.lang.*;

class Rectangle{
    int Length, Width;
    Rectangle() { // Default Constructor
        Length = 0;
        Width = 0;
    }
    Rectangle(int x, int y){ // Parameterized Constructor
        Length = x;
        Width = y;
    }
    int RectArea(){
        return(Length * Width);
    }
}

class ConstructorTypes {
    public static void main(String[] args) {
        Rectangle R = new Rectangle(); // Default Constructor
        Rectangle S = new Rectangle(10, 20); // Parameterized Constructor
        System.out.println(R.RectArea());
        System.out.println(S.RectArea());
    }
}
