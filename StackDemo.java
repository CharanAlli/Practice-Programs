import java.util.*;
class StackDemo
{
public static void main(String[]args)
{
Stack s = new Stack();
s.push("charan");
s.push("varun");
s.push("kiran");
System.out.println(s);
System.out.println(s.search("kiran"));
s.pop();
System.out.println(s);
System.out.println(s.peek());
}
}