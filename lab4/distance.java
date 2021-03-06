import java.util.Scanner;
class distance
{
String n[]={"Bokaro","Deoghar","Hazaribagh","Jamshedpur","Kolkata","Lucknow","Mumbai","Nagpur","Purulia"}; 
int d[]={180,250,90,140,400,740,1500,870,130}; 
int index=-1;
void find(String city)
{
int low=0,high=8,mid;
while(low<=high)
{
mid=(low+high)/2;

if(n[mid].compareTo(city)==0)
{
index=mid;
break;
}
else if(n[mid].compareTo(city)>0)
{
high=mid-1;
}
else
low=mid+1;
}
}
void display(String city)
{
if(index>=0)
System.out.println("Distance of " +city+ " from Ranchi is " +d[index] +" km");
else
System.out.println("Distance not found");
}
public static void main(String arg[])
{
distance obj=new distance();
String c;
Scanner sc=new Scanner(System.in);
System.out.print("Enter City :");
c=sc.next();
obj.find(c);
obj.display(c);
}
}
