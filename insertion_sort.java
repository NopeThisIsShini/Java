import java.util.*;
public class insertion_sort
{
void sort(int arr[])
{
int n=arr.length;
for(int i=1;i<n;i++)
{
int key=arr[i];
int j=i-1;
while(j>=0 && arr[j]>key)
{
arr[j+1]=arr[j];
j=j-1;
}
arr[j+1]=key;
}
for(int i=0;i<n;i++)
System.out.print(arr[i]+" ");
}
public static void main(String args[])
{
insertion_sort obj=new insertion_sort();
Scanner sc=new Scanner(System.in);
System.out.println("Enter no of elements:");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter the elements:");
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
System.out.println("Sorted array");
obj.sort(arr);
}
}