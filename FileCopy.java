import java.io.*;
import java.util.*;
class FileCopy
{
public static void main(String[]args)
{
 try
 {
 FileInputStream fis = new FileInputStream("Sample.txt");
 FileOutputStream fos = new FileOutputStream("test.txt");
 BufferedInputStream bis = new BufferedInputStream(fis);
 BufferedOutputStream bos = new BufferedOutputStream(fos);
 int i;
 while((i=bis.read())!=-1)
  {
   bos.write(i);
  }
  bis.close();
  fis.close();
  bos.close();
  fos.close();
  System.out.println("Success...");
 }
catch(Exception e)
{
 System.out.println(e);
}
}
}