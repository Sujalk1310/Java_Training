import java.lang.*;

class Rectangle
{
  int length, width;
  Rectangle() { // Default Constructor
    length=10;
    width=20;
  }
  int rectarea() {
    return(length*width);
  }
} // class rectangle close

class defaultconstructor
{
 public static void main(String args[])
 {
  Rectangle S=new Rectangle();
  System.out.println("area of rectangleusing function call="+ S.rectarea());
  } //main method close
}// main class close

  
