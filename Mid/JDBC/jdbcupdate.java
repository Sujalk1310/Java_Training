
import java.sql.*;
  
public class jdbcupdate
 {
  
    
    static final String url= "jdbc:mysql://localhost:3306/student12";
  
    public static void main(String[] args)throws ClassNotFoundException
    {
        try {
            
  
            
            Class.forName("com.mysql.jdbc.Driver");
  
            
            Connection conn = DriverManager.getConnection(url, "root", "12341234");
  
            
            Statement stmt = conn.createStatement();
  
            
            int result = stmt.executeUpdate("update stu set name='anju' where name='abc'");
  
            
            if (result > 0)
                System.out.println("successfully updated");
  
            else
                System.out.println("unsucessful updation ");
  
            
            conn.close();
        }
  
        catch (SQLException e) 
{
            System.out.println(e);
        }
    }
}