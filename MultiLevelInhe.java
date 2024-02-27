import java.util.Scanner;
class Staff
{
int eid;
int age;
double phonenumber;
String ename;
public void getStaff()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter staff id");
eid = sc.nextInt();
System.out.println("Enter age");
age = sc.nextInt();
System.out.println("Enter phone number");
phonenumber = sc.nextFloat();
System.out.println("Enter stafff name");
ename = sc.nextLine();
}
public void putStaff()
{
System.out.println("Staff Id is:"+eid);
System.out.println("Staff name is:"+ename);
System.out.println("Staff age is:"+age);
System.out.println("Staff phone number is:"+phonenumber);
}
}
class Admin extends Staff
{
float salary;
public void getAdmin()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter salary");
salary = sc.nextFloat();
getStaff();
}
public void putAdmin()
{
System.out.println("salary is:"+salary);
putStaff();
}
}
class Teacher extends Admin
{
 String sname;
public void getTeacher()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Subject name");
sname = sc.nextLine();
getAdmin();
}
public void putTeacher()
{
System.out.println("---------------");
System.out.println("Subject name is:"+sname);
putAdmin();
System.out.println("---------------");
}
}
class MultiLevelInhe
{
public static void main(String[]args)
{
Teacher t1,t2;
t1 = new Teacher();
t2 = new Teacher();
t1.getTeacher();
t2.getTeacher();
t1.putTeacher();
t2.putTeacher();
}
}