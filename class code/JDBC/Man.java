import java.sql.*;
public class Man
{
    public static void main(String[] args)throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root", "Sumit@966131");
        System.out.println("Connection is stablished");
        Statement st=con.createStatement();
        //-->for insert
//        boolean Result=st.execute("insert into jb(sn, nm, address) values(05, 'Rahul', 'Bahdia')");
//        System.out.println("Result");

       // --> for Select means Display
        boolean Result=st.execute("Select *from jb ");
        System.out.println("Result");
        ResultSet rs=null ;
        if(Result)
        {
           rs=st.getResultSet();

        }
        rs.next();

        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+"\n");
        }
        System.out.println("completed");
    }
}