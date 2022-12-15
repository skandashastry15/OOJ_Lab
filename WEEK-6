import java.util.*;
class account{
String ac_name;
int ac_no;
account(String s,int ac){
ac_name=s;ac_no=ac;
}


}
class sav_act extends account{
Scanner sc=new Scanner(System.in);
double sum=0;
sav_act(String s,int ac){
super(s,ac);
}
void deposite(){
System.out.println("ENTER AMOUNT");
double am=sc.nextInt();
sum+=am;
return;
}
void balance(){
System.out.println("BALANCE AMOUNT IS "+sum);
return;
}
double interest(){
return sum*0.08;
}
void withdraw(){
System.out.println("ENTER THE AMOUNT");
double am=sc.nextInt();
sum-=am;
return;
}
}
class cur_act extends account{
cur_act(String s,int ac){
super(s,ac);
}
Scanner sc=new Scanner(System.in);
double sum1=0;
void deposite(){
System.out.println("ENTER AMOUNT");
double am=sc.nextInt();
sum1+=am;
return;
}
void balance(){
System.out.println("BALANCE AMOUNT IS "+sum1);
return;
}
void withdraw(){
System.out.println("ENTER THE AMOUNT");
double am=sc.nextInt();
sum1-=am;
return;
}

}
class bank{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
int flag=1;

System.out.println("ENTER NAME AND ACCOUNT NUMBER");
String ac_name=sc.next();
int ac_no=sc.nextInt();
sav_act sa=new sav_act(ac_name,ac_no);
                cur_act cu=new cur_act(ac_name,ac_no);

while(flag==1){
System.out.println("1.DEPOSIT AMOUNT"+"\n"+"2.DISPLAY BALANCE"+"\n"+"3.SHOW INTEREST"+"\n"+"4.WITHDRAW"+"\n"+"5.DETAILS"+"\n"+"6.exit");
int ch=sc.nextInt();

switch(ch){
case 1:
System.out.println("1.DEPOSITE AMOUNT IN SAVING ACCOUNT 2.DEPOSITE AMOUNT IN CURRENT ACCOUNT");
int x=sc.nextInt();
if(x==1) sa.deposite();
if(x==2) cu.deposite();
break;
case 2:
System.out.println("1.BALANCE AMOUNT IN SAVING ACCOUNT 2.BALANCE AMOUNT IN CURRENT ACCOUNT");
int y=sc.nextInt();
if(y==1) sa.balance();
if(y==2) cu.balance();
break;
case 3:
System.out.println("INTEREST AMOUNT IS "+sa.interest());
break;
case 4:
System.out.println("1.WITHDRAW USING CASH 2.WITHDRAW USING CHEQUE");
int z=sc.nextInt();
if(z==1) sa.withdraw();
if(z==2) cu.withdraw();
break;
case 5:
System.out.println("ACCOUNT DETAILS ARE "+sa.ac_name+" and "+sa.ac_no);
break;
case 6:
flag=0;
break;
default: System.out.println("INVALID INPUTS");
}
}
   }
}
