abstract class shape{
int x,y;
abstract void printArea();
shape(int a,int b){
x=a;
y=b;
}
}
class rectangle extends shape{
rectangle(int a,int b){
super(a,b);
}
void printArea(){
System.out.println("The rectangle area is "+x*y);
}
}
class triangle extends shape{
triangle(int a,int b){
super(a,b);
}
void printArea(){
System.out.println("The triangle area is "+x*y*0.5);
}
}
class circle extends shape{
circle(int a,int b){
super(a,b);
}
void printArea(){
System.out.println("The triangle area is "+3.14*x*y);
}
}
class jar{
public static void main(String args[]){
rectangle r = new rectangle(2,4);
r.printArea();
triangle t = new triangle(2,3);
t.printArea();
circle c = new circle(3,3);
c.printArea();

}
}
