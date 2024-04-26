import java.util.Scanner;
public class average {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print(" enter the array size:");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("enter array elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        double sum=0;
        for(int i=0;i<size;i++){
            sum=sum+arr[i];
        }
        double  average=(sum /size);
        System.out.print("average of numbers are:"+ average);

    }
}