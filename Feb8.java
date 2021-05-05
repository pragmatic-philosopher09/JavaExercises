import java.util.*;
public class first {
int id;
String name;
String phone;
String dob;
double salary=0.0;
public first(int id,String name,String
phone,String dob) {
this.id=id;
this.name=name;
this.phone=phone;
this.dob=dob;
}
public void Post()
{
System.out.println("1. Professor 2.
Assistant Professor 3. Associate Professor 4.
Teaching Research Assistant");
int n;
Scanner in = new Scanner(System.in);
System.out.println("ENTER THE CHOICE
NUMBER:");
n=in.nextInt();
switch(n)
{
case 1:
salary = 150000 +
30*(150000.0)/100;
break;
case 2: salary = 120000 +
20*(120000.0)/100;
break;
case 3:
salary = 100000 +
10*(100000.0)/100;
break;
case 4:
salary = 20000;
break;
default:
System.out.println("WRONG INPUT,
TRY AGAIN!");
}
}
public void Display()
{
System.out.println("NAME: "+" " +name);
System.out.println("PHONE NO.: "+" "
+phone);
System.out.println("DOB :"+" "+ dob);
System.out.println("SALARY: "+" "+ salary);
}
int getID()
{
return id;
}
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
first d[] = new first[5];
int i,n;
int id;
String name;
String phone;
String dob;
double salary=0.0;
for (i=0;i<2;i++)
{
Scanner in2 = new Scanner(System.in);
System.out.println("ENTER EMPLOYEE'S ID
==> ");
id = in2.nextInt();
System.out.println("ENTER THE NAME OF
THE EMPLOYEE ==> ");
name = in2.next();
System.out.println("ENTER THE PHONE
NUMBER OF THE EMPLOYEE ==> ");
phone = in2.next();
System.out.println("ENTER THE DATE OF
BIRTH OF THE EMPLOYEE ==> ");
dob = in2.next();
d[i]=new first(id,name,phone,dob);
d[i].Post();
}
System.out.println("ENTER THE ID TO BE
SEARCHED ==> ");
n = in.nextInt();
for (i=0;i<2;i++)
{
if(n==d[i].id)
{
d[i].Display();
}
}
}
}
