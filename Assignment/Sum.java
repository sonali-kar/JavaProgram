import java.util.Scanner;
public class Sum {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b)
        {
            System.out.println(a+b);
        }
        else{
            System.out.println(2*(a+b));
        }
    }



    
    
}
