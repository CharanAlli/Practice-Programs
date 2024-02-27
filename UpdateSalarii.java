import java.sql.*;  
class UpdateSalarii{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb?useSSL=false","root","root");  
//here empdb is database name, root is username and password  
Statement stmt=con.createStatement();
stmt.executeUpdate("update employee set salary=salary+5000 where eid=102");
System.out.println("record is updated succe...");
con.close();
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}