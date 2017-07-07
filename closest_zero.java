import java.io.*;
import java.util.*;
class closest_zero
{
public static void main(String args[])
{
int i,j,sum,f=0,k;
int arr[]=new int[args.length];
for(i=0;i<args.length;i++)
arr[i]=Integer.parseInt(args[i]);
int val[]={0,-1,1};
for(k=0;k<val.length;k++)
{
for(i=0;i<arr.length;i++)
{
for(j=0;j<arr.length;j++)
{
sum=0;
if(i!=j)
{
sum=sum+arr[i]+arr[j];
if(sum==val[k])
{
System.out.print(arr[i]+" "+arr[j]);
f=1;
break;
}}
if(f==1)
break;
}
if(f==1)
break;
}}
}}
