import java.lang.Math;
import java.util.Scanner;
class jack{
public static void main(String arg[]){
Scanner s = new Scanner(System.in);
double a,b,c;
double r1,r2,d;
System.out.println("enter the coefficients");
a =s.nextDouble();
b= s.nextDouble();
c = s.nextDouble();
d = (b*b)-(4*a*c);
if(d>0){
System.out.println("roots are real and distinct");
r1 = (-b+(Math.sqrt(d)))/(2*a);
r2 = (-b-(Math.sqrt(d)))/(2*a);
System.out.println("roots are " +r1);
System.out.println(+r2);
}
else if(d==0){
System.out.println("roots are real and equal");
r1=-b/(2*a);
System.out.println("roots are "+r1);
}
else{
System.out.println("roots are complex");
r1 = -b/(2*a);
System.out.println("r1= "+r1+"+i" +Math.sqrt(-d)/(2*a));
System.out.println("r2= "+r1+"-i" +Math.sqrt(-d)/(2*a));
}
}
}
