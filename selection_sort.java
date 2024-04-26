import java.util.*;
class selection_sort
{ 
 public  void selectionSort(int arr[]){ 
int n=arr.length; 
        for (int i = 0; i < n - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < n; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
for(int i=0;i<n;i++)
System.out.print(arr[i]+" ");

    } 
public static void main(String args[])
{
selection_sort obj=new selection_sort();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of element:");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter the elements:");
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
System.out.println("Sorted array:");
obj.selectionSort(arr);
}
} 