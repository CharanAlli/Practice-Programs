import java.io.*;
class BOSExample
{
public static void main(String[]args)throws Exception
{
 FileOutputStream fos = new FileOutputStream("Sample.txt");
 BufferedOutputStream bos = new BufferedOutputStream(fos);
 String s = "hello nano bro";
 byte b[] = s.getBytes();
 bos.write(b);
 bos.flush();
 bos.close();
 fos.close();
 System.out.println("Success...");
}
}