import java.util.Vector;
class VectorDemo
{
public static void main(String[]args)
{
Vector v = new Vector();
System.out.println(v.capacity());
System.out.println(v.size());
for(int i=1;i<=10;i++)
{
v.addElement(i);
}
System.out.println(v.capacity());
System.out.println(v.size());
v.removeElement(1);
System.out.println(v);
}
}