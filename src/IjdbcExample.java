//representation of sql injection with statement object and PreparedStatement object
// TABLE NAME = student
// FIELDS NAME = rollno, name, marks

import java.sql.*;
import java.util.Scanner;
public class IjdbcExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/glai21", "root", "");
        System.out.println("enter the name ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String str = "select * from glai21 where name ="+ name;
        System.out.println("With Statement Object"); // not safe as does not handles sql injection

        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery(str);
        while(rs.next())
        {
            System.out.println(rs.getInt("rollno")+ "    "+ rs.getString("name")+ "  "+ rs.getInt(3));
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

      // prepared statement is used to tackle the problem of sql injections

        System.out.println("With PreparedStatement object  ");
        String str1 = "select * from student where name = ?";
        PreparedStatement ps1 = con.prepareStatement(str1);
        ps1.setString(1,name);
        ResultSet rs1 = ps1.executeQuery();
        while(rs1.next())
        {
            System.out.println(rs1.getInt("rollno")+ "    "+ rs1.getString("name")+ "  "+ rs1.getInt(3));
        }

        // calling the procedure stored by callable statement
        CallableStatement cs = con.prepareCall("{call methodname(?,?)}");
        cs.execute();



    }
}

