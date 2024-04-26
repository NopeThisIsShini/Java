class B{  
  this5 obj;  
  B(this5 obj){  
    this.obj=obj;  
  }  
  void display(){  
    System.out.println(obj.data); 
  }  
}  
  
class this5{  
  int data=10;  
  this5(){  
   B b=new B(this);  
   b.display();  
  }  
  public static void main(String args[]){  
   this5 a=new this5();  
  }  
}  