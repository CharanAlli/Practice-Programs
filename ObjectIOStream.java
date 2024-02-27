import java.io.*;
import java.util.Scanner;
class Employee implements Serializable
{
int eid;
String ename;
float salary;
public Employee()
{
Scanner s= new Scanner(System.in);
System.out.println("Enter Employee name :");
ename = s.nextLine();
System.out.println("enter emp id :");
eid = s.nextInt();
System.out.println("Enter emp salary :");
salary = s.nextFloat();
}
public void showEmp()
{
System.out.println("Employee id is :"+eid);
System.out.println("Employee name is :"+ename);
System.out.println("Employee salary is :"+salary);
}
}
class ObjectIOStream
{
public static void main(String[]args)throws Exception
{
 FileOutputStream fos = new FileOutputStream("Emp.txt");
 ObjectOutputStream oos = new ObjectOutputStream(fos);
 Employee e = new Employee();
 oos.writeObject(e);
 System.out.println("Emp record Stored Successfully..");
 FileInputStream fis = new FileInputStream("Emp.txt");
 ObjectInputStream ois = new ObjectInputStream(fis);
 e=(Employee)ois.readObject();
 e.showEmp();
}
}

