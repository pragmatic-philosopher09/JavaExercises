import java.util.*;
public class ArrayLoopExc {
static void Loop1(int x)
{
int n = x;
int i,j;
System.out.println("Triangular Pattern #1
==>");
for (i=1;i<=n;i++)
{ for(j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
static void Loop2(int b) {
int n=b,i,j,c;
System.out.println("Pattern #2 ==>");
for (i=1;i<=n;i++)
{
c=1;
for(j=1;j<=i;j++)
{
System.out.print(c); c++;
}
System.out.println();
}
for(i=n-1;i>=1;i--)
{
c=1;
for(j=1;j<=i;j++)
{
System.out.print(c); c++;
}
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
double s;
System.out.println("Enter the side length
for triangle:");
s = in.nextDouble();
double ar = (Math.sqrt(3) / 4.0) *
(Math.pow(s, 2));
System.out.println("Area of Equilateral
Triangle ==>" + ar);
int n, i, j, temp, sch, start = 0, end, m;
boolean flag = false;
System.out.println("Enter the range==>");
n = in.nextInt();
Loop1(n);
Loop2(n);
int a[] = new int[n]; //Array
Initialization
System.out.println("Enter elements into
array #1 ==>");
for (i = 0; i < n; i++) {
a[i] = in.nextInt(); //Reading input
from user
}
//Linear Search
System.out.println("Enter the element to be
searched ==>");
sch = in.nextInt();
for (i = 0; i < n; i++) {
if (a[i] == sch) {
flag = true;
break;
}
}
if (flag == true)
System.out.println("Element Found at
Index " + (i + 1));
else
System.out.println("Element Not
Found!");
//Bubble Sort
for (i = 0; i < n; i++) {
for (j = 0; j < (n - 1 - i); j++) {
if (a[j] > a[j + 1]) //Reverse
condition for descending order
{
temp = a[j];
a[j] = a[j + 1];
a[j + 1] = temp;
}
}
}
System.out.println("The Sorted Array ==>");
for (i = 0; i < n; i++) {
System.out.print(a[i] + " ");
}
System.out.println("\nEnter Elements Into
Array #2 ==>"); //For other exercises
int b[] = new int[n];
for (i = 0; i < n; i++) {
b[i] = in.nextInt();
}
//Reversing Elements of Array
end = n - 1;
while (start < end) {
temp = b[start];
b[start] = b[end];
b[end] = temp;
start++;
end--;
}
System.out.println("The Array #2 Reversed
==>");
for (int c : b) {
System.out.print(c + " ");
}
//Deleting Duplicate Items From A Sorted Array
Arrays.sort(b);
j = 0;
int temp2[] = new int[n];
for (i = 0; i < b.length - 1; i++) {
if (b[i] != b[i + 1]) {
temp2[j++] = b[i];
}
}
temp2[j++] = b[n - 1];
for (i = 0; i < j; i++) {
b[i] = temp2[i];
}
System.out.println("\nUnique Elements of
Array ==>");
for (i = 0; i < j; i++) {
System.out.print(b[i] + " ");
}
System.out.println("Enter The Dimensions
for 2-D Matrix ==>");
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
flag = true;
for (i = 0; i < m; i++) {
for (j = 0; j < m; j++) {
if (i == j) {
if (arr[i][j] != 1) {
flag = false;
break;
}
}
}
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
int br[][] = new int[m][m];
int sum[][] = new int[m][m];
System.out.println("\nEnter Elements Into
2nd Matrix ==>");
for (i = 0; i < m; i++) {
for (j = 0; j < m; j++) {
br[i][j] = in.nextInt();
sum[i][j] = arr[i][j] + br[i][j];
}
}
System.out.println("\nElements of Second
Matrix ==>");
for (i = 0; i < m; i++) {
for (j = 0; j < m; j++) {
System.out.print(br[i][j] + " ");
}
System.out.println();
}
System.out.println("\nSum of Two Matrices
==>");
for (i = 0; i < m; i++) {
for (j = 0; j < m; j++) {
System.out.print(sum[i][j] + " ");
}
System.out.println();
}
//Sum of all the rows of first matrix
s=0;
System.out.println("\nSum of Row Elements
of Matrix 1:");
for (i = 0; i < m; i++) {
s = 0;
for (j = 0; j < m; j++) {
s += arr[i][j];
}
System.out.println("\nSum of Elements
of Row #" + (i + 1) + " : " + s);
}
}
}

System.out.println();
}
}
