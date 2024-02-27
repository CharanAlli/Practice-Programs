class MainThread
{
public static void main(String[]args)
{
Thread t = Thread.currentThread();
System.out.println(t);
System.out.println("current Thread name:"+t.getName());
t.setName("thotti gang");
System.out.println("current Thread name:"+t.getName());
for(int i=1;i<=10;i++)
  {
   try
    {	
     System.out.println(i);
     Thread.sleep(1000);
     }
   catch(InterruptedException e)
    {
    System.out.println(e.getMessage());
   }
  }
 }
}