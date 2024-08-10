// PreparedStatement:  use for you can add many values in it

import java.sql.*;
public class Jdbc2 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ raju", "root", "Sumit@966131");

PreparedStatement pps=con.prepareStatement("insert into rajuwa(sn, nm, father) values(?,?,?,?,?)");
pps.setInt(1, 10);
pps.setString(2,"Sonu");
pps.setString(3,"puri");



        pps.setInt(1, 20);
        pps.setString(2,"Sumit");
        pps.setString(3,"Goswami");

        pps.setInt(1, 30);
        pps.setString(2,"Nikhil");
        pps.setString(3,"kumar");

       pps.executeUpdate();

    }
}