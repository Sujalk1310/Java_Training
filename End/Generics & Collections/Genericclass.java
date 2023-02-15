//complete reference example of generic type page no.338
class genclass<T>
{
T ob;
genclass(T obj)
{
  ob=obj;
}
T getobj()
{
return ob;
}
void show()
{
System.out.println("type of T is="+ob.getClass().getName());
}
}
//class closed
class Genericclass
{
public static void main(String args[])
{
// function call from above class for integer
genclass<Integer>iob ;
iob=new genclass <Integer>(88);
iob.show();
//no type cst is needed to convert obj to int type
int v=iob.getobj();
System.out.println("value;"+v);
System.out.println();
//function call from above class for string
genclass<String>strob=new genclass<String>("generics test");
strob.show();
String str =strob.getobj();
System.out.println("value="+str);
}
}





