import java.lang.*;

class Rectangle {
 int length, width;
  Rectangle() { //default constructor
    length=0;
    width=0;
  }
  
  Rectangle(int x, int y) { //parametrized constructor
    length=x;
    width=y;
  }

  int rectarea() {
    return(length*width);
  }
} // class rectangle close

class parameterizedconstructor
{
 public static void main(String args[])
 {
  //Rectangle R=new Rectangle(); //default constructor
  Rectangle S=new Rectangle(10,20);//parameterized constructor
  //System.out.println("area of rectangleusing function call="+ R.rectarea());
  System.out.println("area of rectangleusing function call="+ S.rectarea());
  } //main method close
}// main class close

    
