import java.util.Scanner;
class Reverse
{
public static void main(String[]args)
 {
 int n,r,rev=0;
 Scanner s = new Scanner(System.in);
 System.out.println("Enter any number");
  n = s.nextInt();
while (n>0)
 {
  r = n % 10;
  rev = rev*10+r;
  n = n/10;
  }
  System.out.println(rev+" is the reverse number");
 }
}