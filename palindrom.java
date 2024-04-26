import java.util.Scanner;
class palindrome
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

if(sum==a)
{
	System.out.println("It is a pallindrome no");
}
else
{
System.out.println("It is not a pallindrom no");
}
}
}
