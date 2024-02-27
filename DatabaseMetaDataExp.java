import java.sql.*;
class DatabaseMetaDataExp
{
public static void main(String[]args)
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb?useSSL=false","root","root");
DatabaseMetaData dbmd=con.getMetaData();
System.out.println("Driver name :"+dbmd.getDriverName());
System.out.println("Driver version: "+dbmd.getDriverVersion());
System.out.println("abdul name : "+dbmd.getUserName());
System.out.println("database product name :"+dbmd.getDatabaseProductName());
System.out.println("Database product version :"+dbmd.getDatabaseProductVersion());
con.close();
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}