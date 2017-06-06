import java.io.*;
import java.util.*;
class occurenceno
{
public static void main(String args[])
{
int i;
int arr[]=new int[args.length];
int occ[]=new int[10];
for(i=0;i<args.length;i++)
{
arr[i]=Integer.parseInt(args[i]);
}
for(i=0;i<arr.length;i++)
{
occ[arr[i]]+=1;
}
for(i=0;i<occ.length;i++)
{
if(occ[i]!=0)
System.out.println(i+"="+occ[i]);
}
}}
