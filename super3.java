class base{  
base(){System.out.println("constructor from base");}  
}  
class sub extends base{  
sub(){  
super();  
System.out.println("constructor from sub");  
}  
}  
class super3{  
public static void main(String args[]){  
sub obj=new sub();  
}}  