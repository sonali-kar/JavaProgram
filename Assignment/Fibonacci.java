import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int num1 = 0, num2 = 1,count=0;
        System.out.print("Fibonacci series Upto " + n + ": ");
        while (count<= n)
        {
            System.out.print(num1 + " + ");

            int num3 = num2 + num1; 
            num1 = num2;              //swapping
            num2 = num3; 
            count = count + 1; 
        } 
        }
    }
