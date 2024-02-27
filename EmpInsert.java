import java.sql.*;
import java.util.Scanner;
class EmpInsert
{
public static void main(String[]args)
{
try
{
Scanner s = new Scanner(System.in);
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb?useSSL=false","root","root");
Statement stmt = con.createStatement();
System.out.println("Enter number of records you want to store: ");
int n = s.nextInt();
int i,id,age;
String name;
float salary;
for(i=1;i<=n;i++)
{
System.out.println("Enter "+i+" EmpDetails");
System.out.println("Name");
name = s.next();
System.out.println("ID");
id = s.nextInt();
System.out.println("Age");
age = s.nextInt();
System.out.println("Salary");
salary = s.nextFloat();
stmt.executeUpdate("insert into employee values("+id+",'"+name+"',"+age+","+salary+")");
}
System.out.println(n+"records are inserted successfully.....");
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}

