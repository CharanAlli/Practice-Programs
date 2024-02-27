import java.io.*;
import java.util.Scanner;
class FileObject
{
public static void main(String[]args)
{
String fname;
Scanner s = new Scanner(System.in);
System.out.println("Enter any name:");
fname = s.nextLine();
File f = new File(fname);
System.out.println("File name :"+f.getName());
System.out.println("File path :"+f.getPath());
System.out.println("Absolute path :"+f.getAbsolutePath());
System.out.println("parent :"+f.getParent());
System.out.println("Exists :"+f.exists());
if(f.exists())
{
 System.out.println("Is writable :"+f.canWrite());
 System.out.println("Is Readable :"+f.canRead());
 System.out.println("is a directory:"+f.isDirectory());
 System.out.println("File Size in bytes :"+f.length());
 }
}
}

 