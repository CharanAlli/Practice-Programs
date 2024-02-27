import java.util.Scanner;
class EmpDetails
{
int eid;
String ename;
float salary;
public void getemp()
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Emp Name:");
  ename = sc.nextLine();
  System.out.println("Enter Emp Id:");
  eid = sc.nextInt();
  System.out.println("Enter Emp Salary:");
  salary = sc.nextFloat();
}
public void putemp()
{
  System.out.println("Emp id:"+eid);
  System.out.println("Emp Name:"+ename);
  System.out.println("Emp salary:"+salary);
}
public void updateemp(float percent)
{
salary = salary+salary*percent;
}
}
class EmpTest
{
public static void main(String[]args)
{
  EmpDetails e1,e2;
 e1 = new EmpDetails();
 e2 = new EmpDetails();
 e1.getemp();
 e2.getemp();
 System.out.println("--------------");
 System.out.println("Before updation");
 System.out.println("--------------");
 e1.putemp();
 e2.putemp();
 e1.updateemp(0.1f);
 e2.updateemp(0.5f);
 System.out.println("--------------");
 System.out.println("After updation");
 System.out.println("--------------");
 e1.putemp();
 e2.putemp();
}
}
 
