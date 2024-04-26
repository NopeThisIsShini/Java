import java.util.Scanner;
class fibo
{
  public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the n.: ");
int n=sc.nextInt();
int a=0;
int b=1;
System.out.println("Fibonacci series : ");
while (a <= n)
{
   System.out.println(a);
   int c=a;   
   a=a+b;
   b=c;
   
}
}
}
