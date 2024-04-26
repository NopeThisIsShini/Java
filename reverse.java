import java.util.Scanner;
class reverse
{
  public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no.: ");
int a=sc.nextInt();
int b=a;
int sum=0;
while (b != 0)
{
   int rem= b % 10;
   b=b/10;
   sum=(sum*10)+rem;
}
System.out.println("reverse of given number is:" +sum);
}
}