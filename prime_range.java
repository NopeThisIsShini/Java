
import java.util.*;
class prime_range
{
  public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter how many");
int num=sc.nextInt();
int a[]=new int[num];
System.out.println("Enter array elements:");
for(int j=0;j<num;j++)
a[j]=sc.nextInt();
System.out.println("Prime numbers are:");
for(int j=0;j<num;j++)
{
int c=0;
for(int i=1;i<=a[j];i++)
{
   if(a[j]%i == 0)
	{
		c=c+1;

	}
}
if(c==2)
System.out.print(a[j]+" ");
}
}
}
