import java.sql.*;  
class jdbcsql1
{  
public static void main(String args[]){  
try
{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/student","root","12341234");  
//here studenis database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from stu");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getInt(4));  
con.close();  
}catch(Exception e)
{ System.out.println(e);
}  
}  
}  