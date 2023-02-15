import java.sql.*;

public class JDBCFile {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Drivers");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test","root", "Kinshu@1310");
            System.out.println("Connection Established...");
            Statement st = cn.createStatement();
            int Result = st.executeUpdate("create table employee (empid int primary key, ename varchar(20), esalary int);");
            if (Result > 0) {
                System.out.println("Table Created...");
            }
            else {
                System.out.println("Failed at Table Creation...");
            }
            Result = st.executeUpdate("insert into employee values (1, 'Sujal', 20000);");
            if (Result > 0) {
                System.out.println("Added Record...");
            }
            else {
                System.out.println("Failed at Adding Record...");
            }
            Result = st.executeUpdate("insert into employee values (2, 'Saumya', 60000);");
            if (Result > 0) {
                System.out.println("Added Record...");
            }
            else {
                System.out.println("Failed at Adding Record...");
            }
            System.out.println("Table Before...");
            ResultSet rst = st.executeQuery("select * from employee");
            while (rst.next()) {
                int empid = rst.getInt("empid");
                String ename = rst.getString("ename").trim();
                int esalary = rst.getInt("esalary");
                System.out.println("Id: "+empid+"\tName: "+ename+"\tSalary: "+esalary);
            }
            Result = st.executeUpdate("delete max('empid') from employee");
            if (Result > 0) {
                System.out.println("Deleted Last Record...");
            }
            else {
                System.out.println("Failed at Deleting Last Record...");
            }
            Result = st.executeUpdate("update employee set esalary = 90000 where empid = 1");
            if (Result > 0) {
                System.out.println("Updated Record...");
            }
            else {
                System.out.println("Failed at Updating Record...");
            }
            System.out.println("Table After...");
            rst = st.executeQuery("select * from employee");
            while (rst.next()) {
                int empid = rst.getInt("empid");
                String ename = rst.getString("ename").trim();
                int esalary = rst.getInt("esalary");
                System.out.println("Id: "+empid+"\tName: "+ename+"\tSalary: "+esalary);
            }
            rst.close();
            st.close();
            cn.close();
        }
        catch (Exception e) {
            System.out.println("Error Occured : "+e.getMessage());
        }
    }
}
