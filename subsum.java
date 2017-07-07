import java.util.*
class subsum
{
public static void main(String args[])
{
int i,max=0,n=0,sum=0;
Scanner s=new Scanner(System.in);
int arr[]=new int[args.length];
for(i=0;i<args.length;i++)
arr[i]=Integer.parseInt(args[i]);
for(i=0;i<arr.length-2;i++)
{
sum=sum+arr[i]+arr[i+1]+arr[i+2];
if(max<sum)
{
max=sum;
n=i;
}
sum=0;
}
System.out.println("["+arr[n]+","+arr[n+1]+","+arr[n+2]+"]");
}}
