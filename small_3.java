import java.util.*;
class small_3
{
public static void main(String args [])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter three number:");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
int small=(a<b)?(a<c?a:c):(b<c?b:c);
System.out.println("Smallest is:"+small);
}
}
