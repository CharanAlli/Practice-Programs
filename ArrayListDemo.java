import java.util.ArrayList;
class ArrayListDemo
{
public static void main(String[]args)
{
ArrayList al = new ArrayList();
al.add(10);
al.add(20);
al.add("charan");
al.add(null);
System.out.println(al);
al.set(2,"mallikarjun sir");
al.remove(null);
al.addAll(al);
System.out.println(al);
}
}