class A{  
A getA(){  
return this;  
}  
void msg(){System.out.println("example 6");}  
}  
class this6{  
public static void main(String args[]){  
new A().getA().msg();  
}  
}  