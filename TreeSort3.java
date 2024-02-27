import java.util.*;
import java.io.*;
class Student
{
int    rollno;
String name;
int    age;
Student(int rollno,String name,int age)
{
this.rollno=rollno;
this.name=name;
this.age=age;
}
}
class AgeComparator implements Comparator<Student>
{
public int Compare(Student s1,Student s2)
{
if(s1.age==s2.age)
    return 0;
else if(s1.age<s2.age)
    return -1;
else
     return 1;
}
}
class TreeSort3
{
public static void main(String[]args)
{
TreeSet<Student>al=new TreeSet<Student>(new AgeComparator());
al.add(new Student(101,"Viay",23));
al.add(new Student(102,"Ajay",21));
al.add(new Student(103,"Akhil",27));
al.add(new Student(104,"Anil",32));
System.out.println("Sorting by age");
for(Student st: al)
{
System.out.println(st.rollno+" "+st.name+" "+st.age);
}
}
}