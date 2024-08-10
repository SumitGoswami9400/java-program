import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class New {
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raju","root","Sumit@966131");
        System.out.println("Starting");

        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select *from sumit");
int i=0;
        while(rs.next()){
String s=rs.getString(2);
System.out.println(s);

if(s.length()!=0)
{
i++;
break;
}
}
if(i>0)
{
    System.out.println("name is contains in table");
    st.executeUpdate("delete from sumit");
    System.out.println("execute");
}

    }
}
