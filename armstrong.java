import java.util.Scanner;
import java.lang.Math;
class armstrong
{
  public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no.: ");
int a=sc.nextInt();
int b=a;
int c = 0;
double sum=0;
while (b != 0)
{
   int rem= b % 10;
   b=b/10;
   c=c+1;
}
b=a;
while (b != 0)
{
   int rem= b % 10;
   b=b/10;
   sum=sum+Math.pow(rem,c);
}

if(sum==a)
System.out.println(a+" is a armstrong no");
else
System.out.println(a+" is not a armstrong no");
}
}
