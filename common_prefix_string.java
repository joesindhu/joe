import java.io.*;
import java.util.*;
class common_prefix_string
{
public static void main(String args[])
{
int i,len;
String arr[]=new String[args.length];
for(i=0;i<args.length;i++)
arr[i]=args[i];
String s=arr[0];
int l=arr.length;
for(i=1;i<arr.length;i++)
{
int n=1,f=1;
if(s.length()<arr[i].length())
len=s.length();
else
len=arr[i].length();
while(n<=len)
{
if((s.substring(0,n)).equals(arr[i].substring(0,n)))
{
n++;
if(i==l-1 && n==len)
{
System.out.println(s.substring(0,n));
break;
}}
else
{
s=s.substring(0,n-1);
f=0;
if(i==arr.length-1)
System.out.println(s);
break;
}}
if(n==len && f!=0)
s=arr[i];
} }}
