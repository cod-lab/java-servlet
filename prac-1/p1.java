import java.util.*;
import java.sql.*;

class p1
{
    public static void main(String[] args)
    {
        // String url0 = "jdbc:mysql://localhost:3306/ejava";
        String url = "jdbc:mysql://localhost:3306/ejava?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user = "root";
        String pass = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("enter roll no: ");
        String roll = sc.next();
        System.out.println("enter name: ");
        String name = sc.next();

        sc.close();
        
        String sql1 = "insert into prac1 values('"+roll+"','"+name+"')";
        String sql2 = "select * from prac1;";

        try
        {
            // DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("\ndriver loaded");
            
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("connection established");

            Statement st = con.createStatement();
            int x = st.executeUpdate(sql1);

            if(x==1)
            {
                System.out.println("data inserted successfully\n\ntable:");
                
                ResultSet rs = st.executeQuery(sql2);
                ResultSetMetaData rsmd = rs.getMetaData();  // just to display column
                System.out.println(rsmd.getColumnLabel(1)+" | "+rsmd.getColumnLabel(2));
                while(rs.next())
                    System.out.println(rs.getInt(1) + "\t| " + rs.getString(2)); 
            }
            else    
                System.out.println("failed");

            con.close();
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
    }
}
