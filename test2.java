import java.util.*;
class test2
{
public static void main(String[]args)
{
TreeSet<StringBuffer>ts=new TreeSet<StringBuffer>(new MyComparator());
ts.add(new StringBuffer("Hello"));
ts.add(new StringBuffer("bolo"));
ts.add(new StringBuffer("sublog"));
ts.add(new StringBuffer("aabthum"));
ts.add(new StringBuffer("kehthe"));
System.out.println(ts);
}
}
class MyComparator implements Comparator
{
public int compare(Object o1,Object o2)
{
String s1=o1.toString();
String s2=o2.toString();
int A = s1.length();
int B = s2.length();
if(A<B)
      return -1;
else if(A>B)
      return 1;
else
      return 0;
}
}