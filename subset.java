import java.io.*;
import java.util.*;
class subset
{
public static void main(String args[])
{
int i,j;
boolean check=false;
int a1[]=new int[args.length];
int a2[]=new int[args.length];
for(i=0;i<args.length;i++)
a1[i]=Integer.parseInt(args[i]);
for(i=0;i<args.length;i++)
a2[i]=Integer.parseInt(args[i]);
for(i=0;i<a1.length;i++)
{
for(j=0;j<a2.length;j++)
{
if(a1[i]==a2[j])
{
check=true;
}}
if(check==false)
{
System.out.println("a1 is not a subset of a2");
break;
}}
if(check==true)
System.out.println("a1 is a subset of a2");
}}
