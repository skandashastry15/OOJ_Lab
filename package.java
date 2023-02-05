package cie;
public class Internals {
public int internal[]=new int[5];
}
package cie;
public class Student {
public String name;
public int usn;
public int sem;
}
package see;
import cie.Internals;
public class External extends Internals {
public int external[]=new int[5];
}
import java.util.Scanner;
import cie.Student;
import see.External;
public class Marks {
public static void main(String[] args) {
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter number of students");
n=sc.nextInt();
External student[]=new External[n];
Student details[]=new Student[n];
int final_marks[][]=new int[n][5];
for(int i=0;i<n;i++)
{
student[i]=new External();
details[i]=new Student();
System.out.println("Enter Student usn and sem respectively");
details[i].usn=sc.nextInt();
details[i].sem=sc.nextInt();
System.out.println("Enter Internal marks of 5 subject in respective 
order");
for(int j=0;j<5;j++)
{
student[i].internal[j]=sc.nextInt();
}
System.out.println("Enter external marks of 5 subject in respective 
order");
for(int k=0;k<5;k++)
{
student[i].external[k]=sc.nextInt();
}
}
for(int i=0;i<n;i++)
{
for(int j=0;j<5;j++)
final_marks[i][j]=student[i].internal[j]+(int)(student[i].external[j]/2);
}
for(int i=0;i<n;i++)
{
//System.out.println("Name: "+details[i].name);
System.out.println("USN: "+details[i].usn);
System.out.println("Sem: "+details[i].sem);
System.out.println("Marks of the student is");
for(int j=0;j<5;j++)
{
System.out.println(final_marks[i][j]);
}
}
}
}
