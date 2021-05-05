import java.util.*;
public class HellWor
{
static String Fun1()
{
Scanner in = new Scanner(System.in);
int n;
System.out.println("Enter a number ==>");
n=in.nextInt();
if (n%2==0)
return "Even";
return "Odd";
}
static double Fun2()
{
Scanner in = new Scanner(System.in);
double r,area;
System.out.println("Enter radius of circle
==>");
r = in.nextDouble();
area = Math.PI*Math.pow(r,2);
return area;
}
static String Fun3()
{
Scanner in = new Scanner(System.in);
int yr;
System.out.println("Enter a year ==>");
yr = in.nextInt();
if (yr%4==0) {
return "Leap Year";
}
if (yr%100==0)
{
if(yr%400==0)
return "Leap Year";

}
return "Non-Leap Year";
}
static void Fun4()
{
Scanner in = new Scanner(System.in);
System.out.println("Enter room number ==>");
int rn;
rn = in.nextInt();
if (rn == 823) {
System.out.println("Java Programming");
} else if (rn == 824) {
System.out.println("Python Programming");
} else {
System.out.println("Invalid Input");
}
}
static int Fun5()
{
Scanner in = new Scanner(System.in);
System.out.println("Enter the range ==>");
int n,i,sum=0;
n=in.nextInt();
for (i=1;i<=n;i++)
{
sum=sum+i;
}
return sum;
}
static void Fun6()
{
Scanner in = new Scanner(System.in);
System.out.println("Enter the range ==>");
int n,i,sum=0;
n=in.nextInt();
System.out.println("Multiplication Table
==>");
for(i=1;i<=10;i++)
{
System.out.println(n + " X " + i + " = "+(n*i));
}
}
static void Fun7()
{
Scanner in = new Scanner(System.in);
int x,y;
char choice;
do {
System.out.println("Enter two numbers
==>");
x=in.nextInt();
y=in.nextInt();
System.out.println("Sum of two numbers
==>"+(x+y));
System.out.println("Want to continue
again? Press Y or N.");
choice=in.next().charAt(0);
}while (choice!='N');
}
static void Fun8()
{
Scanner in = new Scanner(System.in);
int n,e=0,o=0,p=0,d=0,i,c=0;
System.out.println("Enter a number ==>");
n=in.nextInt();
while (n!=0)
{
d=n%10;
c=0;
if(d%2==0)
e++;
if(d%2!=0)
o++;
for (i=1;i<=d;i++)
{
if(d%i==0)
c++;
}
if (c==2)
p++;
n/=10;
}
System.out.println("Number of Prime Nos. ==>
"+p);
System.out.println("Number of Odd Nos. ==>
"+o);
System.out.println("Number of Even Nos. ==>
"+e);
}
static void Fun9() {
Scanner in = new Scanner(System.in);
int i, bonus, index = 0;
String name[] = {"Kumar", "Dinesh", "Ganesh",
"Rajesh", "Rakesh"};
String number[] = {"9012345621",
"8143567890", "7114567213", "9098456743",
"8159056784"};
int exp[] = {17, 7, 13, 2, 9};
System.out.println("Enter a name");
String inp;
inp = in.next();
for (i = 0; i < 5; i++) {
if (name[i].equalsIgnoreCase(inp)) {
index = i;
break;
}
}
if (exp[index] > 3) {
bonus = (exp[index] - 3) * 500;
System.out.println("Name:" + inp);
System.out.println("Mobile No.:" +
number[index]);
System.out.println("Eligible for Bonus:"
+ bonus);
} else {
System.out.println("Name:" + inp);
System.out.println("Mobile No.:" +
number[index]);
System.out.println("Ineligible for
Bonus:");
}
}
static String Fun10()
{
Scanner in = new Scanner(System.in);
int n,rev=0,x,d,sum=0;
System.out.println("Enter a number ==>");
n=in.nextInt();
x=n;
while (x!=0)
{
d = x%10;
rev=rev*10+d;
x/=10;
}
sum=n+rev;
if(sum%2==0)
return "Not Odd Sum";
return "Odd Sum";
}
static void Fun11()
{
Scanner in = new Scanner(System.in);
int n,i;
System.out.println("Enter a number ==>");
n=in.nextInt();
System.out.println("Numbers in reverse order
==>");
for (i=n;i>=1;i--)
{
System.out.println(i + " ");
}
}
static void Fun12()
{
Scanner in = new Scanner(System.in);
int n;
System.out.println("Enter a number ==>");
n=in.nextInt();
String s = Integer.toString(n);
System.out.println("First Digit
==>"+s.charAt(0));
System.out.println("Last Digit ==>"+s.charAt(s.length()-1));
}
static int Fun13()
{
Scanner in = new Scanner(System.in);
int n,d=0,sum=0;
System.out.println("Enter a number ==>");
n=in.nextInt();
while (n!=0)
{
d=n%10;
sum+=d;
n/=10;
}
return sum;
}
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
String res1,res3,res10;
double res2;
int res5,res9,res13;
res1 = Fun1();
System.out.println(res1);
res2 = Fun2();
System.out.println(res2);
res3 = Fun3();
System.out.println(res3);
Fun4();
res5 = Fun5();
System.out.println(res5);
Fun6();
Fun7();
Fun8();
Fun9();
res10=Fun10();
System.out.println(res10);
Fun11();
Fun12();
res13=Fun13();
System.out.println(res13);
}
}
