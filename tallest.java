import java.util.*;
class tallest
{
public static void main(String args[])
{
int i,j=0;
Scanner s=new Scanner(System.in);
int arr[]=new int[50];
for(i=0;i<50;i++)
arr[i]=s.nextInt();
int k=s.nextInt();
Arrays.sort(arr);
for(i=49;i>=0;i--)
{
arr[j]=arr[i];
j++;
}
System.out.println("the fourth tallest height:"+arr[3]);
for(i=4;i<k;i++)
System.out.print(arr[i]+" ");
}}
