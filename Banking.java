import java.util.Scanner;
class Banking
{
class money
{
double ca;
money(double c)
{
ca=c;
}
double deposit(double d)
{

return ca+d;
}
double withdraw(double w)
{

return ca-w;
}
}
class details
{
String n,t,add;
int ac_n;
void set_data(String nm, String ty, String a, int A_N)
{
n=nm;
t=ty;
add=a;
ac_n=A_N;
}
void display()
{
System.out.println("NAME OF ACCOUNT HOLDER :" +n);
System.out.println("ADDRESS OF A/C HOLDER  :" +add);
System.out.println("TYPE OF ACCOUNT        :" +t);
System.out.println("ACCOUNT NUMBER         :" +ac_n);
}
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int ch,a_n;
String na,tp,adr;
double camt,amt;
System.out.println("Enter name,address,type,a/c no, current amount");
na=sc.next();
adr=sc.next();
tp=sc.next();
a_n=sc.nextInt();
camt=sc.nextDouble();
System.out.println("Enter 1 if choice is deposit or 2 if withdrawal, amount to deposit/withdraw");
ch=sc.nextInt();
amt=sc.nextDouble();
Banking b = new Banking();
Banking.details obj= b.new details();
obj.set_data(na,tp,adr,a_n);
obj.display();
Banking.money m= b.new money(camt);
if(ch==1)
{
System.out.println("CURRENT AMOUNT         :" +camt);
System.out.println("DEPOSIT AMOUNT         :" +amt);
System.out.println("FINAL AMOUNT           :" +m.deposit(amt));
}
else
{
System.out.println("CURRENT AMOUNT         :" +camt);
System.out.println("WITHDRAWAL AMOUNT      :" +amt);
System.out.println("FINAL AMOUNT           :" +m.withdraw(amt));
}
}
}
