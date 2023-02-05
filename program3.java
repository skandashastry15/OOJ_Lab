import java.util.Scanner;
class Book{
String name;
String author;
int pages;
int prices;

Book(String name,String author,int pages,int prices){
this.name = name;
this.author = author;
this.pages = pages;
this.prices = prices;
}
void book_get(){
System.out.println("the name is "+name);
System.out.println("the author is "+author);
System.out.println("the prices is "+prices);
System.out.println("the pages is "+pages);
}

}
class baba{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
Book b[] = new Book[2];
for(int i=0;i<2;i++){
System.out.println("enter details");
String n = s.next();
String a = s.next();
int p = s.nextInt();
int pg = s.nextInt();
b[i] = new Book(n,a,p,pg);
}
for(int i=0;i<2;i++){
b[i].book_get();
}
}
}
