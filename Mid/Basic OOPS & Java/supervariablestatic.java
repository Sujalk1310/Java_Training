class Parent {
  static  float x=100;
  int y=30;
  void print() {
    System.out.print("Super class variable="+x);
  }
}// parent class close

class child extends Parent {
  int x=20;
  void display() {
    System.out.print("superclass y="+y);  // it will print subclass value not superclass value
    System.out.println("superclass x="+Parent.x); //parent class variable can be accessed by super keyword
    System.out.print("subclass x="+x);
  }
}

class supervariablestatic {
  public static void main(String args[]) {
    child C=new child();
    C.display();
    System.out.print("subclass x="+C.x);
  }
}
 
 



