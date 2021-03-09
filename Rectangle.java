import java.util.Scanner;
public class Rectangle
{
    double length,width,area;String colour;
    void SetLength(int i)
    {
        length=i;
    }
    void SetWidth(int j)
    {
        width=j;
    }
    void SetColour(String col)
    {
        colour=col;
    }
    void FindArea()
    {
        area=length*width;
    }
    boolean compare(Rectangle a){
        if(colour==a.colour&&area==a.area)
        return true;
        else return false;
    }
    public static void main(String args[])
    {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        boolean b = false;
        r1.SetLength(8);
        r2.SetLength(6);
        r1.SetWidth(3);
        r2.SetWidth(4);
        r1.SetColour("Red");
        r2.SetColour("Red");
        r1.FindArea();
        r2.FindArea();
        b=r1.compare(r2);
        if(b==true)
        System.out.println("Matching Rectangle");
        else
        System.out.println("Not Matching Rectangle");
    }
}