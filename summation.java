import java.util.Scanner;
class Summation
{
public static void main(String[]args)
{
 int n,sum=0,r;
 Scanner s = new Scanner(System.in);
 System.out.println("Enter any number");
 n = s.nextInt();
 while(n>0)
 {
  r = n%10;
  sum = sum+r;
  n = n/10;
 }
 System.out.println(sum+" is the sum of the individual digits of the given number ");
 }
}
 