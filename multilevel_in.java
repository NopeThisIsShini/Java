import java.util.*;
class base
{
public void display()
{
System.out.println("it's a base class");
}
}
class sub1 extends base
{
public void display1()
{
System.out.println("sub class of base class");
}
}
class sub2 extends sub1
{
public void display2()
{
System.out.println("sub class of derived class");
}
}
class multilevel_in
{
public static void main(String [] args)
{
sub2 obj=new sub2();
obj.display();
obj.display1();
obj.display2();
}
}