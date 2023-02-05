import java.util.*;

class sgpa {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);

String name;
int usn;
int i;
double m1,m2,m3,m4,m5;


for(i=0;i<3;i++) {
System.out.println("Enter your name : ");
 name = sc.next();
System.out.println("Enter your USN : ");
 usn = sc.nextInt();
System.out.println("Enter your marks1 : ");
 m1 = sc.nextDouble();
System.out.println("Enter your marks2 : "); 
 m2 = sc.nextDouble();
System.out.println("Enter your marks3 : ");
 m3 = sc.nextDouble();
System.out.println("Enter your marks4 : ");
 m4 = sc.nextDouble();
System.out.println("Enter your marks5 : ");
 m5 = sc.nextDouble();
System.out.println("name : " + " " + name);
System.out.println("Usn : " + " " + usn);
System.out.println("Marks1 : " + " " + m1);
System.out.println("Marks2 : " + " " + m2);
System.out.println("Marks3 : " + " " + m3);
System.out.println("Marks4: " + " " + m4);
System.out.println("Marks5 : " + " " + m5);

double avg = (m1+m2+m3+m4+m5)/5;
double sgpa = avg/10;

System.out.println("sgpa : " + " " + sgpa);
}
}
}
