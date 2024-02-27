import java.util.Scanner;
class ArmStrong
{
public static void main(String[]args)
{
 int n,r,m,sum=0,cnt=0;
 Scanner s = new Scanner(System.in);
 System.out.println("Enter any number");
  n = s.nextInt();
 m = n;
 while(n>0)
  {
   cnt++;
  n = n/10;
  }
 n = m;
 while(n>0)
 {
  r = n%10;
  sum = sum + (int)Math.pow(r,cnt);
  n = n/10;
 }
 if(sum == m)
 System.out.println(m+" is an Arm Strong number");
 else
 System.out.println(m+" is not an Arm Strong number");
 }
}

    