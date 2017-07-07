import java.util.*;
class subsetequal
{
int i;
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String s2=s.nextLine();
LinkedList<String> l1=new LinkedList<String>();
LinkedList<String> l2=new LinkedList<String>();
String a1[]=s1.split(" ");
String a2[]=s2.split(" ");
for(i=0;i<a1.length;i++)
l1.add(a1[i]);
for(i=0;i<a2.length;i++)
l2.add(a2[i]);
if(l2.containsAll(l1))
System.out.println("a1 is a subset of a2");
else
System.out.println("a1 is not a subset of a2");
}}
