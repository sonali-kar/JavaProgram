import java.util.Scanner;
import java.lang.Math; 
public class AbsoluteDifference {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n<21)
        {
          System.out.println(Math.abs(n-21));
        }
        else
        {
            System.out.println(Math.abs(2*(n-21)));
        }
    }
    
}
