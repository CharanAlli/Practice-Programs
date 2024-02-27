import java.io.*;
class DOSExample
{
public static void main(String[]args)throws IOException
{
 InputStream input = new FileInputStream("sample.txt");
 DataInputStream data = new DataInputStream(input);
 int count = input.available();
 byte[] ary = new byte[count];
 data.read(ary);
 // System.out.print(new String(ary));
for(byte bt : ary)
{
 char k = (char)bt;
 System.out.print(k);
}
}
}