import java.io.*;
import java.util.*;
class leastno
{
public static void main(String args[])
{
int j=0,i,k=0;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
int temp=n;
while(temp!=0)
{
k++;
temp=temp/10;
}
int arr[]=new int[k];
while(n!=0)
{
int a=n%10;
arr[j]=a;
j++;
n=n/10;
}
Arrays.sort(arr);
for(i=0;i<arr.length-m;i++)
{
if(arr[i]!=0)
System.out.print(arr[i]);
}
}}

