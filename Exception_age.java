import java.util.*;
class Father {
  public Father(int age) throws WrongAgeException {
    if (age < 0) {
      throw new WrongAgeException();
    }
  }
}

class Son extends Father {
  public Son(int age, int fatherAge) throws WrongAgeException {
super(fatherAge);
    if (age >= fatherAge) {
      throw new WrongAgeException();
    }
  }
}



class Main {
  public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter father age");
int fa=sc.nextInt();

    try {
      Father f = new Father(fa);
 System.out.println("Father Age= "+fa);

    } catch (WrongAgeException e) {
      System.out.println("Invalid Age(Age >0)");
System.exit(0);
    }
System.out.println("Enter son age");
int so=sc.nextInt();
    try {
      Son s = new Son(so,fa );
System.out.println("Son Age= "+so);

    } catch (WrongAgeException e) {
      System.out.println("Invalid (Son age> Father Age)");
    }
  }
}
