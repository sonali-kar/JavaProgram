import java.util.Scanner;
public class TriangleArea {
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the height and breadth of the triangle");
    int h = sc.nextInt();
    int b = sc.nextInt();
    int area = (h*b)/2;
    System.out.println("The area of the triangle is"+" "+area);
    }   
}
