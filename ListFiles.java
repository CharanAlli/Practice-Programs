import java.io.*;
import java.util.Scanner;
class ListFiles
{
public static void main(String[]args)throws IOException
{
Scanner s = new Scanner(System.in);
System.out.println("Enter dirpath :");
String dirpath = s.nextLine();
System.out.println("Enter dirname :");
String dirname = s.nextLine();
File f = new File(dirpath,dirname);
if(f.exists())
{
String arr[] = f.list();
int n = arr.length;
for(int i=0;i<n;i++)
{
System.out.println(arr[i]);
File f1 = new File(arr[i]);
if(f1.isFile())
System.out.println(":is a file");
if(f1.isDirectory())
{
System.out.println(":is a Directory");
System.out.println("Number of entries in the directory"+n);
}
else
System.out.println("Directory not found");
}
}
}
}
