import java.io.*;
import java.util.*;
class coin_sum
{
public static void main(String args[])
{
int i,n,count=0,j,k=0;
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
int sum=s.nextInt();
String sp[]=s1.split(" ");
int l=sp.length;
int coin[]=new int[l];
for(i=0;i<l;i++)
coin[i]=Integer.parseInt(sp[i]);
Arrays.sort(coin);
int temp=sum;
int len=l;
while(k<len)
{
if(temp>=coin[l-1])
{
n=temp/coin[l-1];
temp=temp%coin[l-1];
count=count+n;
}
if(temp==0)
{
break;
}
k++;l--;
}
System.out.println(count);
} }
