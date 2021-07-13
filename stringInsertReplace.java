import java.util.*;
import java.lang.*;
class StringInsertReplace
{
public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter your String:");
 String str=sc.next();
 System.out.println("Enter inserting String:");
  String ins=sc.next();
  System.out.println("Enter position to insert:");
  int p=sc.nextInt();
  StringBuilder sb=new StringBuilder(str);
  sb.insert(p,ins);
  System.out.println(sb.toString());
  System.out.println("enter your replacing string:");
  String rep=sc.next();
   StringBuilder sd=new StringBuilder(str);
   int p1=sc.nextInt();
    int p2=sc.nextInt();
   System.out.println(sd.replace(p1,p2,rep));
    System.out.println(sd.toString());
 } 
}