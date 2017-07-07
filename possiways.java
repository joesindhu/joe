import java.util.*;
class possiways
{
public static void main(String args[])
{
int i,count=1;
Scanner s=new Scanner(System.in);
String st=s.next();
boolean b[]=new boolean[st.length()-1];
for(i=0;i<st.length()-1;i++)
{
int m=Integer.parseInt(st.substring(i,i+2));
if(m>=1 && m<=26)
{
count++;
b[i]=true;
}}
if(i=0;i<b.length-2;i++)
{
if(b[i] && b[i+2])
count++;
}
System.out.println(count);
}}
