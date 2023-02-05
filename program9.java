class printer{
String str;
printer()
{
str="";
}
synchronized void print(String str)
{
System.out.print("["+str);
try {
Thread.sleep(1000);
}catch(InterruptedException e)
{
System.out.println("Error occured");
}
try {
System.out.println("]");
Thread.sleep(1000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}
class SampleThread implements Runnable
{
String msg;
printer pt;
Thread t;
public SampleThread(printer pr,String message)
{
pt=pr;
msg=message;
t=new Thread(this);
t.start();
}
@Override
public void run() {
// TODO Auto-generated method stub
pt.print(msg);
}
}
public class InterThread {
public static void main(String[] args) {
printer pt=new printer();
SampleThread s1=new SampleThread(pt,"HELLO");
SampleThread s2=new SampleThread(pt,"CSE");
SampleThread s3=new SampleThread(pt,"WORLD");
SampleThread s4=new SampleThread(pt,"BMS");
try {
s1.t.join();
s2.t.join();
s3.t.join();
s4.t.join();
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}
