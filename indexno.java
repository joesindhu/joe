import java.io.*;
import java.util.*;
class indexno
{
public static void main(String args[])
{
int i;
int arr[]=new int[args.length];
for(i=0;i<args.length;i++)
arr[i]=Integer.parseInt(args[i]);
Arrays.sort(arr);
for(i=0;i<arr.length;i++)
{
if(arr[i]==i)
System.out.println("the number"+arr[i]+"equals its index"+i);
}
}}
