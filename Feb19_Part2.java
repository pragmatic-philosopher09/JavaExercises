import java.util.Arrays;
import java.util.Scanner;
public class StringExercise2 {
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
int n;
System.out.println("Enter the no. of names
to be entered ==>");
n=in.nextInt();
String name[] = new String[n];
String temp="";
for(int i=0;i<5;i++)
{
name[i]=in.nextLine();
}
//Name Sorting
Arrays.sort(name);
for(String result:name)
{
System.out.println(result);
}
//Printing in Reverse Order
String s;
System.out.println("Enter the string ==>");
s=in.nextLine();
String rev="";
for(int i=s.length()-1;i>=0;i--)
{
rev=rev+s.charAt(i);
}
System.out.println(rev);
//Counting Occurrences Of Word
String s1;
System.out.println("Enter the string ==>");
s1=in.nextLine();
System.out.println("enter the word");
String word=in.nextLine();
String temp2[]=s1.split(" ");
int count=0;
for(int i=0;i<temp2.length;i++)
{
if (word.equals(temp2[i]))
{
count++;
}
}
System.out.println(count);
}
}
