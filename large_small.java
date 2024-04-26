import java.util.*;
public class large_small {
    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
        System.out.print(" enter the array size:");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("enter array elements:");
        for(int i=0;i<size;i++){
             arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        int smallest=arr[0];
        // find smallest and largest
        for(int i=0;i<size;i++){
            if (arr[i]<smallest){
                smallest =arr[i];
            }
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("smallest number of the array is:"+ smallest);
        System.out.println("largest number of the array is:"+ largest);

    }
}