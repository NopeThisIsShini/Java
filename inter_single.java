import java.util.*;
 interface base
{
int add(int a,int b);
}

class inter_single implements base
{
public int add(int a,int b)
{
return(a+b);
}
public static void main(String args[])
{
inter_single obj=new inter_single();
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers:");
int c=sc.nextInt();
int d=sc.nextInt();
System.out.println("Add="+obj.add(c,d));
}
}