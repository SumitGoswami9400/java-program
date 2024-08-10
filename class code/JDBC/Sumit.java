import java.sql.*;
public class Sumit
{
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver is found");
    //     Connection con=DriverManager.getConnection("jdbc:mysql://localHost:3306/JDBC","root","root");
    // //     Statement st=con.createStatement();
    // int i=st.executeUpdate("insert into Sumit values(03, 'mohit')");
    //    System.out.println(i);
    }
}       