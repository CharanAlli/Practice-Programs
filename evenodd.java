import java.util.Scanner;
class  EvenOdd
 {
  public static void main(String[]args)
 {
 int n;
 Scanner s = new Scanner(System.in);
  System.out.println("Enter any number");
   n = s.nextInt();
if (n % 2 == 0 )
   {
    System.out.println(n+"is an Even number");
   }
else
   {
    System.out.println(n+"is an Odd number");
   }
  }
}