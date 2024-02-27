import java.sql.*;
import java.util.Scanner;
class InsertPrepared
{
public static void main(String[]args)
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Scanner s = new Scanner(System.in);
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb?allowPublicKeyRetrival=true&useSSL=false","root","root");
PreparedStatement stmt = con.prepareStatement("update employee set age =age+? where eid=?");
System.out.println("Enter emp id:");
int id = s.nextInt();
System.out.println("enter number of years to be updated");
int yrs = s.nextInt();
stmt.setInt(1,yrs);
stmt.setInt(2,id);
int i=stmt.executeUpdate();
System.out.println(i+" records inserted sucess...");
con.close();
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}