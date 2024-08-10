import java.sql.*;
public classs Myfirstjdbc
{
public static void main(String args[])
{
try{
DriverManager.registerDriver(new com.mysql.jdbc.Driver());
}
catch(Exception e)
{
System.out.println(e);
}
}
}