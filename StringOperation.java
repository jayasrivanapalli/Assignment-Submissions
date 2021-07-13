import java.util.*;
class StringOperation
{
public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int i;
 System.out.println("Enter your String:");
 String str=sc.next();
 System.out.println("Enter inserting String:");
  String ins=sc.next();
  System.out.println("Enter position to insert:");
  int p=sc.nextInt();
  StringBuilder sb=new StringBuilder(str);
  sb.insert(p,ins);
  System.out.println(sb.toString());

 } 
 }