import java.sql.*;
class ShowEmpDes
{
public static void main(String[]args)
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb?useSSL=false","root","root");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from employee");
while(rs.next())
System.out.println("Eid: "+rs.getInt(1)+"Ename: "+rs.getString(2)+"Age: "+rs.getInt(3));
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}