import java.util.Scanner;
class Palindrome
{
public static void main(String[]args)
{
 int n,r,rev=0,m;
 Scanner s = new Scanner(System.in);
 System.out.println("Enter any number");
   n = s.nextInt();
   m = n;
 while(n>0)
  {
   r = n%10;
   rev = rev*10+r;
   n = n/10;
  }
  if(rev == m)
  System.out.println(m+" is a palindrome number");
  else
      System.out.println(m+" is not a palindrome number");
  }
}