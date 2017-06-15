import java.io.*;
import java.util.*;
class arr_avg_equal
{
public static void main(String args[])
{
int i,sum=0,x=0,y=0,m,z;
Scanner s=new Scanner(System.in);
String st=s.nextLine();
String sp[]=st.split(" ");
int l=sp.length;
int arr[]=new int[l];
for(i=0;i<l;i++)
arr[i]=Integer.parseInt(sp[i]);
int mid=l/2;
if(l%2==0)
{
m=mid-1;
z=mid;
}
else
{
m=mid;
z=mid+1;
}
for(i=0;i<=m;i++)
{
sum=sum+arr[i];
y++;}
int avg1=sum/y;
sum=0;
for(i=z;i<l;i++)
{
sum=sum+arr[i];
x++;}
int avg2=sum/x;
if(avg1==avg2)
System.out.println("possible");
else
System.out.println("not possible");
}}
