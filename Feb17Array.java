public class ArrayExercise {
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
int n, i, sch, temp, j, start = 0, end, k;
boolean flag = false;
System.out.println("Enter the size of the array ==>");
n = in.nextInt();
int a[] = new int[n]; //Array
Initialization and Declaration
System.out.println("Enter elements into an array #1 ==>");
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
Index " + i);
else
System.out.println("Element Not
Found!");
//Bubble Sort
for (i = 0; i < n; i++) {
for (j = 0; j < (n - 1 - i); j++) {
if (a[j] > a[j + 1]) //Reverse condition for descending order
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
System.out.println("\nEnter Elements Into Array #2 ==>");
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
System.out.println("The Array #2 Reversed ==>");
for (int c : b) {
System.out.print(c + " ");
}
//Deleting Duplicate Items From A Sorted Array
Arrays.sort(b);
j=0;
int temp2[] = new int[n];
for(i=0;i<b.length-1;i++) {
if (b[i] != b[i + 1]) {
temp2[j++] = b[i];
}
}
temp2[j++]=b[n-1];
for(i=0;i<j;i++)
{
b[i]=temp2[i];
}
System.out.println("\nUnique Elements of Array ==>");
for (i = 0; i < j; i++) {
System.out.print(b[i] + " ");
}
}
}
