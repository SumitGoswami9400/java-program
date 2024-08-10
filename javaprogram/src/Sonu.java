import java.sql.*;


public class Sonu {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sumit", "root", "Sumit@966131");
//

        CallableStatement cs = con.prepareCall("call emp(?, ?)");
        cs.setInt(1, 5);
        cs.setString(2, "Sumit");
        cs.execute();
        System.out.println("connection ho gy");
    }
}

//        callableStatement.setInt(1, 1); // Assuming 1 is the empid ofthe row you want to update
//        callableStatement.setString(2, "yogesh"); // New employee name/
//       // Execute the stored procedure
//       callableStatement.execute();
//        System.out.println("Update successful!");

