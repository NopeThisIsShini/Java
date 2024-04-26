import java.util.*;

class demo {

void sort (int arr[])
{

int n=arr.length;

for (int i = 2; i < n ;i++) 
{
 int key=arr[i];
int j=i-1;
while(j>0 && arr[j]>key)
{
 arr[j+1]=arr[j];
j=j-i;
}
arr[j+1]=key;
}

for (int i = 0 ;i < n; ++i)
System.out.print ( arr[i]+ " " );

} 
public static void main(String args[])
{
demo obj = new demo(); 
Scanner sc= new Scanner(System.in);

System.out.println("Enter the no of elements :");

int n = sc.nextInt(); 
int arr[]=new int[n];

System.out.println("Enter the elements :"); 
for (int i = 0; i < n; ++i )
 arr[i]= sc.nextInt();

System.out.println("Sorted array :");
 obj.sort (arr);

}
}