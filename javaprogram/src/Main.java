
//ExecuteQuery  mtlb isme ResultSet ka use hota bs isme print value krne ke kiya jata h

//import java.sql.*;
//public class Main {
//    public static void main(String[] args) throws Exception {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        System.out.println("Driver is found");
//        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Sumit@966131");
//        System.out.println("Conncetion is Stablish");
//        Statement st = con.createStatement();
//        ResultSet rs = st.executeQuery("Select *from jb where nm = 'Monu' ");
//        ResultSet rs = st.executeQuery("Select *from jb ");
//        while (rs.next()) {
//            System.out.println(rs.getInt(1) + "\t");
//            System.out.println(rs.getString(2) + "\t");
//            System.out.println(rs.getString(3) + "\t");
//        }
//        rs.next();
//        System.out.println(rs.getInt(1));
//        System.out.println(rs.getString(2));
//        System.out.println(rs.getString(3));
//            System.out.println("completed");
//    }
//}



//Execute  mtlb aap isme dono type ke insert, update,delete or select ka use kr skte h
import java.sql.*;
import java.util.concurrent.ExecutionException;

public class Main
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


