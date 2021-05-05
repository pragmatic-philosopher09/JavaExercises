import java.util.Scanner;
public class ArrayExc2 {
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
int m, n, i, j, c = 0;
boolean flag = true;
System.out.println("Enter The Dimensions of
Matrix ==>");
m = in.nextInt();
int arr[][] = new int[m][m];
//Enter Elements Into 2-D Array
System.out.println("\nEnter Elements Into
Array ==>");
for (i = 0; i < m; i++) {
for (j = 0; j < m; j++) {
arr[i][j] = in.nextInt();
}
}
System.out.println("\nGiven Matrix ==>");
for (i = 0; i < m; i++) {
for (j = 0; j < m; j++) {
System.out.print(arr[i][j] + " ");
}
System.out.println();
}
//Checking If It Is An Identity Matrix
for (i = 0; i < m; i++) {
for (j = 0; j < m; j++) {
if (i == j) {
if (arr[i][j] != 1) {
flag = false;
break;
}
}
if (i != j) {
if (arr[i][j] != 0) {
flag = false;
break;
}
}
}
}
if (flag == true)
System.out.println("Matrix Is An
Identity Matrix");
else
System.out.println("Matrix Is Not An
Identity Matrix");
//Displaying Transpose
System.out.println("\nTranspose of The
Given Matrix ==>");
for (i = 0; i < m; i++) {
for (j = 0; j < m; j++) {
System.out.print(arr[j][i] + " ");
}
System.out.println();
}
int b[][] = new int[m][m];
int s[][] = new int[m][m];
System.out.println("\nEnter Elements Into
2nd Matrix ==>");
for (i = 0; i < m; i++) {
for (j = 0; j < m; j++) {
b[i][j] = in.nextInt();
s[i][j] = arr[i][j] + b[i][j];
}
}
System.out.println("\nElements of Second
Matrix ==>");
for (i = 0; i < m; i++) {
for (j = 0; j < m; j++) {
System.out.print(b[i][j] + " ");
}
System.out.println();
}
System.out.println("\nSum of Two Matrices
==>");
for (i = 0; i < m; i++) {
for (j = 0; j < m; j++) {
System.out.print(s[i][j] + " ");
}
System.out.println();
}
//Sum of all the rows of first matrix
int sum;
System.out.println("\nSum of Row Elements
of Matrix 1:");
for (i = 0; i < m; i++) {
sum = 0;
for (j = 0; j < m; j++) {
sum += arr[i][j];
}
System.out.println("\nSum of Elements
of Row #" + (i + 1) + " : " + sum);
}
int z[][] = {{1, 2, 3, 4}, {1, 2, 3}, {1,
2}, {1}};
sum = 0;
for (int x[]:z) {
for (int l:x) {
sum += l;
}
}
System.out.println("\nSum of Elements of
Given Matrix ==> " + sum);
}
}
