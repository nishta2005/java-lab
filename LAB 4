abstract class Shape {
 int dim1;
 int dim2;
 abstract void area();
 Shape(int a,int b){
  dim1 = a;
  dim2 = b;
}
}

class Rectangle extends Shape{
 Rectangle(int l, int b){
 super(l,b) ;
}
 void area(){
 System.out.println("Area of rectangle is" + " " + dim1*dim2);
}
}
 
class Triangle extends Shape{
 Triangle(int h,int b){
 super(h,b);
}
void area(){
System.out.println("Area of triangle is" + " " + dim1*dim2*0.5);
}
}

class ShapeDemo{
public static void main(String args[]){
  Rectangle r1=new Rectangle(10,20);
  Triangle t1=new Triangle(3,4);
  r1.area();
  t1.area();
}
}

