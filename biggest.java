import java.util.Scanner;
class Biggest
{
 public static void main(String[]args)
{
 int a,b,c;
 Scanner s = new Scanner(System.in);
   System.out.println("Enter 3 numbers");
  a = s.nextInt();
  b = s.nextInt();
  c = s.nextInt();
if(a>b && a>c)
  {
   System.out.println(a+"is the biggest number amoung these");
  }
else if(b>c)
  {
   System.out.println(b+"is the biggest number amoung these");
  }
else
  {
   System.out.println(c+"is the biggest number amoung these");
  }
 }
}
