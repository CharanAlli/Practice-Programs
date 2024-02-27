import java.util.Scanner;
class PatternTwo
{
public static void main(String[]args)
{
 int n,i,j;
 Scanner sc = new Scanner(System.in);
  System.out.println("Enter number of rows");
  n = sc.nextInt();
 for(i=0; i<n; i++)
   {
    for(j=1; j<=n-i; j++)
      System.out.print(j+" ");
    System.out.println();
   }
  }
 }