import java.util.*;
class strong
{
  static int fact(int n)
{
if(n==0 || n==1)
  return 1;
else
  return n*fact(n-1);
}
  public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no.: ");
int a=sc.nextInt();
int b=a;
double sum=0;
while (b != 0)
{
   int rem= b % 10;
   b=b/10;
   sum=sum+strong.fact(rem);
}

if(sum==a)
System.out.println("It is a strong no");
else
System.out.println("It is not a strong no");
}
}
