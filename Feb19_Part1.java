import java.util.Scanner;
public class StringExercise {
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
String userName, passWd, passWd2;
boolean v = true;
System.out.print("Enter the username and password ==>");
userName = in.nextLine();
passWd = in.nextLine();
System.out.println("Enter the password again ==>");
passWd2 = in.nextLine();
if (userName.isEmpty()) {
System.out.println("Invalid User
Name");
v = false;
if (passWd.isEmpty()) {
System.out.println("Invalid Password");
v = false;
}
if (v == true) {
if (passWd.length() < 8) {
System.out.println("Password
Length Is Less!");
}
if (passWd.contains(userName))
System.out.println("Weak
Password!");
if (passWd.equals(passWd2) ==
false)
System.out.println("Error!
Password Doesn't Match");
}
}
}
}
