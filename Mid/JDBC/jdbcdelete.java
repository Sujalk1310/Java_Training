
import java.sql.*;
  
public class jdbcdelete
 {
  
    
    static final String url= "jdbc:mysql://localhost:3306/student12";
  
    public static void main(String[] args)throws ClassNotFoundException
    {
        try {
            
            
            Class.forName("com.mysql.jdbc.Driver");
  
            
            Connection conn = DriverManager.getConnection(url, "root", "12341234");
  
            
            Statement stmt = conn.createStatement();
  
            
            int result = stmt.executeUpdate("delete from stu where marks>=90");
  
            
            if (result > 0)
                System.out.println("successfully deleted");
  
            else
                System.out.println("unsucessful deletion ");
  
            
            conn.close();
        }
  
        catch (SQLException e) 
{
            System.out.println(e);
        }
    }
}