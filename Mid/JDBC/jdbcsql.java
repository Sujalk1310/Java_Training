import java.sql.*;

public class jdbcsql {
    public static void main(String arg[]) {
        Connection cn = null;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sujal", "root", "Kinshu@1310");

            Statement st;
            st = cn.createStatement();
            ResultSet rst;
            rst = st.executeQuery("select * from part");
            int rollno;
            String name;
            String clas;
            while (rst.next()) {
                rollno = rst.getInt("pid");
                name = rst.getString("pname").trim();
                clas = rst.getString("color").trim();
                System.out.println("rollno : " + rollno + "\t" + "name : " + name + "\t" + "class :" + clas + "\t");
            }
            rst.close();
            st.close();
            cn.close();
        } catch (Exception exception) {
            System.out.println(exception);
        }
    } // function ends
} // class ends