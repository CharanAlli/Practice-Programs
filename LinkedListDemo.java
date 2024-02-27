import java.util.*;
class LinkedListDemo
{
public static void main(String[]args)
{
LinkedList L = new LinkedList();
L.add("charan");
L.add("robo");
L.add(null);
L.add("Hero");
System.out.println(L);
System.out.println("-------------------------");
L.remove(null);
System.out.println(L);
System.out.println("-------------------------");
L.set(0,"satish");
L.addAll(L);
System.out.println(L);
System.out.println("-------------------------");
L.add("It's Enough");
System.out.println(L);
}
}