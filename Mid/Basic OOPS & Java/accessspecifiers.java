//access specifiers
class person {
    private String name="ABC";
    private int age=30;
    int rollno;
    public int a=500;
    void print() { 
        System.out.println("name="+name); //
        System.out.println("rollno="+rollno); //
        System.out.println("a="+a); //
        System.out.println("age="+age); //
    }
}// person class closed
class accessspecifiers {
    public static void main(String args[]) {
        person P=new person();
        P.print();
        // System.out.println("name="+P.name); // private cannot called by variable name and object
        System.out.println("rollno="+P.rollno);
        System.out.println("a="+P.a);
        // System.out.println("age="+P.age);
        // Private cannot called by variable name and object
    }
}//class closed
