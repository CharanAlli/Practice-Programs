import java.sql.*;  
class Manapuram
{  
public static void main(String args[])
{  
try
{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","root");  
//here empdb is database name, root is username and password  
Statement stmt=con.createStatement();  
stmt.execute("create table employee1(eid int NOT NULL,ename varchar(50) NOT NULL,age int NOT NULL)");  
System.out.println("table is created succ...");
con.close();  
}
catch(Exception e)
{
System.out.println(e.getMessage());
}  
}  
}  

