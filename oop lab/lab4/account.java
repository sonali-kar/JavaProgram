import java.util.Scanner;
class account
{
String n,add,type;
int ac_n;
double i_amt, c_amt;
account(String nm, int a_n, double i_a)
{
n=nm;
ac_n=a_n;
i_amt=i_a;
}
account(String nm, int a_n, String a, String t, double i_b)
{
n=nm;
add=a;
type=t;
ac_n=a_n;
i_amt = i_b;
}
void Deposit(double b)
{
c_amt=i_amt+b;
}
void Withdraw(double b)
{
c_amt=c_amt-b;
}
double Get_Balance()
{
return c_amt;
}
void display()
{

System.out.println(" ACCOUNT DETAILS");
System.out.println("Name : "+n);
System.out.println("Account No : "+ac_n);
System.out.println("Address : "+add);
System.out.println("Type : "+type);
System.out.println("Initial Balance : "+i_amt);
System.out.println("Current Balance : "+ Get_Balance());

}
public static void main(String arg[])
{
Scanner sc=new Scanner (System.in);
String name,addr,ty;
int an;
double ia,d,w;
System.out.println("Enter name, account number, initial amount :");
name=sc.nextLine();
an= sc.nextInt();
ia= sc.nextDouble();
account a1 = new account(name,an,ia);
a1.add="Ranchi";
a1.type="Savings";
System.out.println("Enter amount to deposit and withdraw :");
d= sc.nextDouble();
w= sc.nextDouble();
a1.Deposit(d);
a1.Withdraw(w);
a1.display();
System.out.println("Enter name, account number, address, initial amount, type :");
name=sc.next();
an= sc.nextInt();
ia= sc.nextDouble();
addr= sc.next();
ty= sc.next();
System.out.println("Enter amount to deposit and withdraw :");
d= sc.nextDouble();
w= sc.nextDouble();
account a2= new account(name,an,addr,ty,ia);
a2.Deposit(d);
a2.Withdraw(w);
a2.display();
}
}


