class base{  
void m(){System.out.println("m method from base");}  
}  
class sub extends base{  
void m(){System.out.println("m method from sub");}    
void display(){  
super.m();
}  
}  
class super2{  
public static void main(String args[]){  
sub obj=new sub();
obj.display(); 
obj.m();
}
} 