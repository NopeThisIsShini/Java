import java.util.*;
 interface base{  
int add(); 
}  
interface base1{  
int display();
}
class mulp_inh_interface implements base,base1{  
public static void main(String args[])
{  int c;
mulp_inh_interface obj=new mulp_inh_interface();
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers");
int a=sc.nextInt();
int b=sc.nextInt();
obj.add();
obj.display();
}
public int add()
{int a,b,c;
c=a+b;
}
public void display(){
int c;
System.out.println(c+" ");
}
}

 