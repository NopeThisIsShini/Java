import java.util.Scanner;
public class ele_occur
{
    public static void main(String args[])
    {
      Scanner sc=new  Scanner(System.in);
      System.out.println("Enter the no of elements:");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter the elements:");
      for(int j=0;j<n;j++)
       arr[j]=sc.nextInt();  
       ele_occur obj=new ele_occur();
       obj.occ(arr);
    }
    void occ(int arr[])
    {
        System.out.println("Enter the searching element:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int c=0;
        for(int j=0;j<arr.length;j++)
        {
            if(x==arr[j])
            c=c+1;
        }
        if(c>0)
        System.out.println("No. of occurence = "+c+" times");
        else 
        System.out.println("No  occurence");
    }
}
