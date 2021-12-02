import java.sql.*;
/*Write a java program that establishes a connection to mysql  database successfully. If the connection is successful,
it should display a message “Connection Established successfully”. In case, it is not able to do so due to any exception,
it should display the message “Connection could  not be established “.
 If there is an exception, it should also display the description of the exception.*/
public class JDBC_Q1
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        Connection con = null;
     try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/glai21", "root", "");
         System.out.println("connection established successfully");
    }catch (Exception obj){
         System.out.println("connection could not be established");
     }
     finally {
            if(con!=null) con.close();
     }
    }
}
