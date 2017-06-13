import java.io.*;
import java.util.*;
import java.lang.*;
class descend_binaryno
{
public static void main(String args[])
{
int i,j;
Scanner s=new Scanner(System.in);
String st=s.nextLine();
String sp[]=st.split(" ");
int arr[]=new int[sp.length];
int bc[]=new int[sp.length];
int bc2[]=new int[sp.length];
for(i=0;i<sp.length;i++)
{
arr[i]=Integer.parseInt(sp[i]);
bc[i]=Integer.bitCount(arr[i]);
bc2[i]=Integer.bitCount(arr[i]);
}
Arrays.sort(bc2);
for(i=bc2.length-1;i>=0;i--)
{
for(j=0;j<bc.length;j++)
{
if(bc2[i]==bc[j] && arr[j]!=0)
{
System.out.println(arr[j]);
arr[j]=0;
}}}
}}
