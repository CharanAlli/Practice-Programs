import java.util.Scanner;
class company
{
String cname,loc;
public void getcompany()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter company name");
cname = sc.nextLine();
System.out.println("Enter company location");
loc = sc.nextLine();
}
public void putcompany()
{
System.out.println("company name:"+cname);
System.out.println("company location:"+loc);
}
}
class Employee extends company
{
int eid;
String ename,desg;
float salary;
static String city;
public static void setcity()
{
city = "Hyderabad";
}
public void getemp()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Emp name");
ename = sc.nextLine();
System.out.println("Enter emp designation");
desg = sc.nextLine();
System.out.println("Enter Emp Id");
eid = sc.nextInt();
System.out.println("Enter Emp salary");
salary = sc.nextFloat();
getcompany();
}
public void putemp()
{
System.out.println("---------------");
System.out.println("Emp Id :"+eid);
System.out.println("Emp name :"+ename);
System.out.println("Emp designation:"+desg);
System.out.println("Emp salary :"+salary);
System.out.println("Emp city :"+city);
putcompany();
System.out.println("--------------");
}
}
class EmpSingleInhe
{
public static void main(String[]args)
{
Employee e1,e2;
e1 = new Employee();
e2 = new Employee();
e1.getemp();
e2.getemp();
Employee.setcity();
e1.putemp();
e2.putemp();
}
}