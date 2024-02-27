class ChildThread extends Thread
  {
    public void run()
    {
   for(int i=1;i<=10;i++)
    {
      try
       {
       System.out.println("Child:"+i);
       Thread.sleep(1000);
       }
     catch(InterruptedException e)
       {
     System.out.println(e.getMessage());
       }
    }
    }
}
class ThreadDemo
{
public static void main(String[]args)throws InterruptedException
{
   ChildThread t = new ChildThread();
    t.start();
    System.out.println(t);
    for(int i=0;i<=10;i++)
    {
     System.out.println("main:"+i);
     Thread.sleep(1000);
    }
  }
}