import java.util.Scanner;
public class Largest {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(x>y && x>z)
        {
            System.out.println("The largest number is" + x);
        }
        else if(y>x && y>z)
        {
            System.out.println("The largest number is" + y);
        }
        else
        {
            System.out.println("The largest number is"+" " + z);
        }
    }
    
}
