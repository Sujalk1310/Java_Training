//mutilevel
class shape
{
protected double m;
shape(double m)
{
 this.m=m;
}
void compute()
{
 System.out.println("area of shape="+(m*m*m));
}
}//shape class closed
class square extends shape
{
square(double m)
{
super(m);
}
void area()
{
System.out.println(" area of square"+ (m*m)); //instance variable of parent class
}
}//square class closed
class Rectangle extends square
{
 private double b;
Rectangle(double x, double y)
{
 super(x);
 b=y;
}
void cal()
{
 System.out.println("area of rectangle"+(b*m));
}
}//rectangle class closed
class multilevel1
{
public static void main(String args[])
{
Rectangle R=new Rectangle(5.5,2.3);
R.compute();//shape method
R.cal(); //rectangle method called
R.area();// square method called
System.out.println("m="+R.m);

}
}


