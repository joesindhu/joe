import java.io.*;
import java.util.*;
class repeatno
{
public static void main(String args[])
{
int i,j;
int arr[]=new int[args.length];
for(i=0;i<args.length;i++)
arr[i]=Integer.parseInt(args[i]);
int occ[]=new int[arr.length];
for(i=0;i<arr.length;i++)
{
for(j=0;j<arr.length;j++)
{
if(arr[i]==arr[j])
{
occ[i]+=1;
}}}
for(i=0;i<occ.length;i++)
{
if(occ[i]==2)
{
Sysem.out.println(arr[i]);
break;
}}
}}
