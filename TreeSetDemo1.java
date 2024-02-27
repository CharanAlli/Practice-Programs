import java.util.*;
class TreeSetDemo1
{
public static void main(String[]args)
{
TreeSet<String>ts2=new TreeSet<String>();
ts2.add("A");
ts2.add("S");
ts2.add("D");
ts2.add("F");
ts2.add("G");
System.out.println("Initial"+ts2);
System.out.println("Reverse set:"+ts2.descendingSet());
System.out.println("Head Set:"+ts2.headSet("D"));
System.out.println("subset:"+ts2.subSet("D","G"));
System.out.println("Tailset:"+ts2.tailSet("D"));
}
}
