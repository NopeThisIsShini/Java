class A{  
A(){System.out.println(" default constructor");}  
A(int a,int b){  
this();
System.out.println(a+b);  
}  
}  
class this3{  
public static void main(String args[]){  
A a=new A(10,20);  
}}  