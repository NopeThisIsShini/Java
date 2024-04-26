class base{  
int a=5;
int b=8;
int op=a+b;
}  
class sub extends base{  
int op=a-b;  
void display(){  
System.out.println("sub="+op);
System.out.println("add="+super.op);  
}  
}  
class super1{  
public static void main(String args[]){  
sub obj=new sub();  
obj.display();  
}}  