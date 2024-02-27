import java.io.*;
class FISExample
{
public static void main(String[]args)
{
 try
  {
   FileInputStream fis = new FileInputStream("sample.txt");
   int i = 0;
   while((i=fis.read())!=-1)
   {
    System.out.println((char)i);
   }
   fis.close();
   }
  catch(FileNotFoundException e)
   {
    System.out.println("Invalid file path");
   }
  catch(IOException e)
   {
    System.out.println(e.getmessage());
   }
 }
}