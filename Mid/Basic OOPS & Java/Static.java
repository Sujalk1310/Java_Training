import java.lang.*;

class Operations{
    static float multi(float x, float y){
        return (x * y);
    }
    float divide(float x, float y){
        return (x / y);
    }
}

class Static {
    public static void main(String[] args) {
        float a = Operations.multi(4.0f, 5.0f);
        System.out.println("Calling Multiply using class name = "+ a);
        Operations O = new Operations();
        float b = O.divide(2.3f, 4.0f);
        System.out.println("Calling divide using object = "+ b);
    }
}
