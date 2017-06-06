import java.io.*;
import java.util.*;
class sumno
{
public static void main(String args[])
{
int i,j,k,sum=0;
int arr[]=new int[args.length];
for(i=0;i<args.length;i++)
arr[i]=Integer.parseInt(args[i]);
for(i=0;i<arr.length;i++)
{
for(j=i;j<arr.length;j++)
{
if(i!=j)
{
sum=arr[i]+arr[j];
for(k=0;k<arr.length;k++)
{
if(sum==arr[k])
System.out.println(arr[i]+"+"+arr[j]+"="+sum);
}}
}}
}}
