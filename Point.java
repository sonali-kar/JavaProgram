import java.util.Scanner;
class Point
{
int x,y;
double d;
void getdata(int a, int b)
{
x=a;
y=b;
}
double distance(Point p)
{
d=Math.sqrt((x-p.x)*(x-p.x) + (y-p.y)*(y-p.y));
return d;
}
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int x1,y1;
double r;
Point p1=new Point();
Point p2=new Point();
System.out.println("enter coordinates of 1st point");
x1=sc.nextInt();
y1=sc.nextInt();
p1.getdata(x1,y1);
System.out.println("enter coordinates of 2nd point");
x1=sc.nextInt();
y1=sc.nextInt();
p2.getdata(x1,y1);
r=p1.distance(p2);
System.out.println("Distance is : " +r);
}
}