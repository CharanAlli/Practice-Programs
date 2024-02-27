import java.util.Scanner;
class MyPrime
{
public static void main(String[]args)
{
int m,n,i,j,cnt=0;
Scanner s = new Scanner(System.in);
System.out.println("Enter start range :");
m = s.nextInt();
System.out.println("Enter end of range :");
n = s.nextInt();
for(i=m;i<=n;i++)
{
 for(j=2;j<=i/2;j++)
  {
   if(i%j==0)
   { 
    cnt=1;
    break;
   }
  }
  if(cnt==0)
    {
      System.out.println(i+" ");
    }
  cnt=0;
}
}
}
