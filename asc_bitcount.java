import java.io.*;
import java.util.*;
class asc_bitcount
{
public static void main(String args[])
{
int i,j=0;
Scanner s=new Scanner(System.in);
int k=s.nextInt();
int n=(int)Math.pow(2,k);
int bc[]=new int[n];
for(i=0;i<n;i++)
bc[i]=Integer.bitCount(i);
Arrays.sort(bc);
while(j<=bc[n-1])
{
for(i=0;i<n;i++)
{
if(j==Integer.bitCount(i))
{
String st=Integer.toBinaryString(i);
int no=k-st.length();
while(no!=0)
{
System.out.print("0");
no--;
}
System.out.print(Integer.toBinaryString(i)+" ");
}}
j++;
} }
}
