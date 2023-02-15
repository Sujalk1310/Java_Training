class parent {
  void print() {
    System.out.println("parent class");
  }
}//parent class or superclass closed


class child extends parent {
  void show() {
    System.out.println("child class");
  }
} //child class or subclass closed

class Inheritance { //single inheritance
  public static void main(String args[]) {
    parent P = new parent();
    child  C = new child();
    P.print();
    C.print();
    C.show();
  } // main method closed
} //class closed