package com.hackerrank.programs;
 class Shape{
    int length;
    int breadth;
   public Shape(){   
   };
   
   public Shape(int len,int bre){
       this.length=len;
       this.breadth=bre;
   };
   
   public void area(){
        System.out.println(1+" "+1);
   }
}
 class Rectangle extends Shape{
    int length;
    int breadth;
    
   public Rectangle(int len,int bre){
      super(len, bre);
       this.length=len;
       this.breadth=bre;
   };
   
   public void area(){
	   
        System.out.println(length*breadth);
   }
 
}
public class Solu {

	 
	 public static void main(String[] args) {
		Rectangle rectangle=new Rectangle(4, 5);
		Shape shape=new Shape();
		shape.area();
		rectangle.area();
	}

}
