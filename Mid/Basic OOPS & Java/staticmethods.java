//static and non-static methods
import java.lang.*;
class Operation {
  static float multi(float x, float y) {
    return(x*y);
  }
  float divide(float x, float y) {
    return (x/y);
  }
}
class staticmethods {
  public static void main(String args[]) {
    float a=Operation.multi(4.0f,5.0f);
    System.out.println("calling Multiply using class name="+a);
    Operation O=new Operation();
    float b=O.divide(2.3f,4.0f);  
    System.out.println("calling divide using object="+b);
  }
}