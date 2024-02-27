import java.sql.*;
import java.util.Scanner;
class DeletePrepared
{
public static void main(String[]args)
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Scanner s = new Scanner(System.in);
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb?allowPublicKeyRetrival=true&SSL=false","root","root");
PreparedStatement stmt = con.prepareStatement("delete from employee where eid=?");
System.out.println("Enter emp id");
int id = s.nextInt();
stmt.setInt(1,id);
int i=stmt.executeUpdate();
System.out.println(i+" records are deleted success....");
con.close();
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}