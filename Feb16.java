import java.util.Scanner;
public class LoopExercise {
void Loop1(int x)
{
int n = x;
int i,j;
System.out.println("Triangular Pattern #1
==>");
for (i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
void Loop2(int y)
{
int n=y;
int i,j,c=1;
System.out.println("Triangular Pattern #2
==>");
for(i=1;i<=n;i++)
{
c=1;
for(j=1;j<=i;j++)
{
System.out.print(c);
c++;
}
System.out.println();
}
}
void Loop3(int z)
{
int n=z;
int i,j;
System.out.println("Triangular Pattern #3
==>");
for(i=n;i>=1;i--)
{
for(j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
void Loop4(int a) {
int n = a, c, i, j;
System.out.println("Triangular Pattern #4
==>");
for (i = n; i >= 1; i--) {
c = 1;
for (j = 1; j <= i; j++) {
System.out.print(c);
c++;
}
System.out.println();
}
}
void Loop5(int b)
{
int n=b,i,j,c;
System.out.println("Pattern #5 ==>");
for (i=1;i<=n;i++)
{
c=1;
for(j=1;j<=i;j++)
{
System.out.print(c);
c++;
}
System.out.println();
}
for(i=n-1;i>=1;i--)
{
c=1;
for(j=1;j<=i;j++)
{
System.out.print(c);
c++;
}
System.out.println();
}
}
void Loop6()
{
Scanner in = new Scanner(System.in);
int i,n;
boolean flag = false;
for(i=1;i<=5;i++) {
System.out.println("Enter a number:");
n = in.nextInt();
if (n != 13) {
continue;
} else {
flag = true;
break;
}
}
if(flag==false)
System.out.println("Unlucky");
else
System.out.println("Lucky Winner!");
}
void Loop7()
{
Scanner in = new Scanner(System.in);
int i,n,sum=0;
for(i=1;i<=5;i++)
{
System.out.println("Enter a number
==>");
n=in.nextInt();
if(n%2==0)
continue;
sum+=n;
}
System.out.println("Sum of only the odd
terms ==>"+sum);
}
public static void main(String args[])
{
LoopExercise obj = new LoopExercise();
Scanner in = new Scanner(System.in);
int n0;
System.out.println("Enter a number ==>");
n0 = in.nextInt();
obj.Loop1(n0);
obj.Loop2(n0);
obj.Loop3(n0);
obj.Loop4(n0);
obj.Loop5(n0);
obj.Loop6();
obj.Loop7();
}
}
           
