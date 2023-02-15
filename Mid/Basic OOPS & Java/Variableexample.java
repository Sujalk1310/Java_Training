class Variable
{  int m;
   int myVariable=5; //instance variable initialization
   static int data = 30;//staic variable
   void fun() { 
    int i=10;
    System.out.println("local variable="+i);
    System.out.println("instance variable="+myVariable);
  }  
}

class Variableexample {
  public static void main(String args[]) {
    Variable obj = new Variable();
    System.out.println("Value of instance variable: "+obj.myVariable); //instance varible called by object
    System.out.println("Value of static variable: "+Variable.data);//Static variable called by classname
    obj.fun();
  }
}