import java.util.*;

class AddSort
{
public static void main(String args[])
{
ArrayList<Integer> j=new ArrayList<Integer>();
ArrayList<Integer> k=new ArrayList<Integer>();
j.add(10);
j.add(20);
j.add(30);
j.add(40);
System.out.println("The list of j:"+j);
k.add(100);
k.add(200);
k.add(300);
k.add(400);
System.out.println("The list of k:"+k);
j.addAll(k);
System.out.println("The list:"+j);
Collections.sort(j);
System.out.println("the sorted list:"+j);
}
}
