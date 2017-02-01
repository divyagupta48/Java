import java.sql.*;
import javax.swing.*;

public class JDBCExample1 
{
      public static void main (String args[]) throws ClassNotFoundException, SQLException  
      {
    				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          Connection con=DriverManager.getConnection("Jdbc:Odbc:empdsn");
     	  //Connection con=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)}; DBQ=" + "F:/user/mahesh/documents/employee.mdb" );                   
     	  Statement stmt=con.createStatement();
     	  ResultSet rs=stmt.executeQuery("select * from employee");
     	  System.out.println("Employee Code\t\t Designation");
     	  System.out.println("---------------------------------------------------");
     	  while(rs.next())
     	  {
     		  int ec = rs.getInt("empcode");
     		  System.out.print(ec);
     		  String s=rs.getString("Designation");
     		  System.out.println("\t\t" + s);
     		  System.out.println("------------------------");
            }
     	      	  con.close();
     	 

 }
  
}
