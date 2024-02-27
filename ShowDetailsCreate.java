import java.sql.*;  
class ShowDetailsCreate
{  
public static void main(String args[])
{  
try
{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb?useSSL=false","root","root");  
//here empdb is database name, root is username and password  
Statement stmt=con.createStatement();  
stmt.executeUpdate("create table employee(eid int primary key,ename varchar(50) NOT NULL,age int NOT NULL,salary float NOT NULL)");  
System.out.println("table is created succ...");
con.close();  
}
catch(ClassNotFoundException e)
{
 System.out.println("Driver not found");
} 
catch(SQLException e)
{
 System.out.println(e.getMessage());
}  
}  
}  
