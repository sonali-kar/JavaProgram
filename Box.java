import java.util.Scanner;
public class Box {
    double h,w,d;
    
         Box(double width,double height,double depth)
        {
            h=height;
            w=width;
            d=depth;
        }
        double volume()
        {
         double v;
        v=h*w*d;
        return v;
        }
       
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double h,d,w;
        System.out.println("Enter height,depth,width");
        h=sc.nextDouble();
        d=sc.nextDouble();
        w=sc.nextDouble();
        Box b1 = new Box(w,h,d);
        System.out.println(b1.volume());
    
        }
    
    }
    
