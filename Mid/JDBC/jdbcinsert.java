
import java.sql.*;
  
public class jdbcinsert
 {
  
    
    static final String url= "jdbc:mysql://localhost:3306/student";
  
    public static void main(String[] args)throws ClassNotFoundException
    {
        try {
            
  
            
            Class.forName("com.mysql.jdbc.Driver");
  
            
            Connection conn = DriverManager.getConnection(url, "root", "12341234");
  
            
            Statement stmt = conn.createStatement();
  
            
            int result = stmt.executeUpdate("insert into stu(name,class,marks) values('rachel','b.tech','45')");
  
            
            if (result > 0)
                System.out.println("successfully inserted");
  
            else
                System.out.println("unsucessful insertion ");
  
            
            conn.close();
        }
  
        catch (SQLException e) 
{
            System.out.println(e);
        }
    }
}