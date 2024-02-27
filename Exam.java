class Exam
{
public static void main(String[]args)
{
int [] arr = new int [] {9,10,11,12,13,14,15,132,675};
   System.out.println("Original array:");
  for(int i=0;i<arr.length;i++)
    {
     System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.println("Reverse array");
    for(int i=arr.length-1;i>0;i--)
    {
     System.out.print(arr[i]+" ");
    }
 }
}
