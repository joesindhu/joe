import java.io.*;
import java.util.*;
class binary
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String st=s.nextLine();
String sp[]=st.split(" ");
int arr[]=new int[sp.length];
for(i=0;i<sp.length;i++)
{
int n=Integer.parseInt(sp[i]);
arr[i]=Integer.bitsCount(n);
System.out.println(arr[i]);
}
}}

