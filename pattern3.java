import java.util.Scanner;
class PatternThree
{
public static void main(String[]args)
{
  int i,n,j;
 Scanner s = new Scanner(System.in);
 System.out.println("Enter number of rows");
  n = s.nextInt();
 for(i=1; i<=n; i++)
  {
   for(j=n; j>=i; j--)
   System.out.print(j+" ");
  System.out.println();
  }
 }
}