import java.util.*;
class palindrome
{
public static void main(String args[])
{
int i,f=0,j=0;
Scanner s=new Scanner(System.in);
String st=s.nextLine();
char ch[]=st.toCharArray();
for(i=ch.length-1;i>=0;i--)
{
if(ch[i]!=ch[j])
{
System.out.println("not a palindrome");
f=1;
break;
}
j++;
if(f!=1)
System.out.println("palindrome");
}}
