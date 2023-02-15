class Parent {
  int x=100;
  void print() {
    System.out.println("Super class variable="+x);
  }
}
class child extends Parent {
  int x=20;
  void display() {
    System.out.println("superclass x="+x);// it will print subclass value not superclass value
    System.out.println("superclass x="+super.x); //parent class variable can be accessed by super keyword
    System.out.println("subclass x="+x);
  }
}
class supervariable {
  public static void main(String args[]) {
    child C=new child();
    C.display();
    System.out.print("subclass x="+C.x);
  }
}