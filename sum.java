import java.util.Scanner;
class Sum
{
public static void main(String[]args)
{
 int n,r,sum1=0,sum2=0;
 Scanner s = new Scanner(System.in);
 System.out.println("Enter any number");
 n = s.nextInt();
 while(n>0)
  {
   r = n%10;
    if(r%2 == 0)
      sum1=sum1+r;
    else
      sum2=sum2+r;
    n = n/10;
  }
  System.out.println(sum1+" is the sum of all the even digits");
  System.out.println(sum2+" is the sum of all the odd digits");
 }
}
