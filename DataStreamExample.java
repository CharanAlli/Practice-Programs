import java.io.*;
class DataStreamExample
{
public static void main(String[]args)
{
 try
  {
   FileInputStream fin = new FileInputStream("sample.txt");
   byte b[] = new byte[fin.available()];
   fin.read(b);
   System.out.println(new String(b));
   fin.close();
   System.out.println("Success...");
   }
 catch(Exception e)
   {
    System.out.println(e);
    }
 }
}