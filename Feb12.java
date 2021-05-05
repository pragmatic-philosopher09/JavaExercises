import java.util.*;
public class HellWor
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
int n1,s=0,n2,i;
System.out.println("Enter the number of iterations
==>");
n1=in.nextInt();
for (i=1;i<n1;i++)
{
s=s+i;
}
System.out.println("Sum of first N numbers ==>"+s);
for (i=n1;i>=1;i--)
{
System.out.println(i+" ");
}
System.out.println("Enter the number for which mult
table should be there ==>");
n2 = in.nextInt();
System.out.println("Multiplication Table ==>");
for(i=1;i<=10;i++)
{
System.out.println(n2 + "X" + i + "=" + (n2*i));
}
int n3;
System.out.println("Enter a number :");
n3=in.nextInt();
String str;
str = Integer.toString(n3);
int l = str.length();
System.out.println("First and Last Digits of the
Number ==>");
System.out.println(str.charAt(0)+ " "+str.charAt(l-
1));
int n4,d;
System.out.println("Enter a number ==>");
n4 = in.nextInt();
s=0;
while (n4!=0)
{
d=n4%10;
s=s+d;
n4/=10;
}
char choice;
do {
System.out.println("Enter two numbers ==>");
int x,y;
x=in.nextInt();
y=in.nextInt();
System.out.println("Addition of Numbers ==>"+"
"+(x+y));
System.out.println("Want to continue? Press Y or
N");
choice = in.next().charAt(0);
} while(choice!='N');
}
}
