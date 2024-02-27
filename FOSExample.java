import java.io.FileOutputStream;
class FOSExample
{
 public static void main(String[]args)
{
 try
 {
  FileOutputStream fout = new FileOutputStream("Sample.doc");
  String s = "kaise ho jiii";
  byte[]b = s.getBytes();
  fout.write(b);
  fout.close();
  System.out.println("Success...") ;
 }
 catch(Exception e)
 {
  System.out.println(e);
 }
}
}