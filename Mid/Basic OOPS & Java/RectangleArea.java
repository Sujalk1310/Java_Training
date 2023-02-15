import java.lang.*;

class Rectangle {
  int length, width;
  void getdata(int x, int y) {
    length=x;
    width=y;
  }
  int rectarea() {
    int area=length*width;
    return area;
  }
} // class rectangle close

class RectangleArea {
  public static void main(String args[]) {
    Rectangle R=new Rectangle();
    R.length=23;
    R.width=20;
    int cal=R.length*R.width;
    System.out.println("area of rectangle using data members="+cal);
    Rectangle S=new Rectangle();
    S.getdata(10,2);
    System.out.println("area of rectangleusing function call="+ S.rectarea());
  } //main method close
}// main class close

  
