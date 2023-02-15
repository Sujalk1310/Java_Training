//Immutability

class strimmutable
{
public static void main(String args[])
{
String s1 = "Data";
System.out.println(s1.hashCode());
String s2 = "base";
s1 = s1+s2;
System.out.println(s1.hashCode());
System.out.println(s1);
}
}
