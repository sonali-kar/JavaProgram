import java.util.Scanner;
public class CoinsSum {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of 1 ruppee coins");
        int a = sc.nextInt();
        System.out.println("Enter the number of 2 ruppee coins");
        int b = sc.nextInt();
        System.out.println("Enter the number of 5 ruppee coins");
        int c = sc.nextInt(); 
        System.out.println("Enter the number of 10 ruppee coins");
        int d = sc.nextInt();
        int a1 = a*1;
        int a2 = b*2;
        int a3 = c*5;
        int a4 = d*10;
        float sum = a1+a2+a3+a4;
        System.out.println("The total amount is "+sum);
       
    
    
    
    
    }
    
}
