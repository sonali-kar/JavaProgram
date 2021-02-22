import java.util.Scanner;
public class Checkhi {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println(s.startsWith("Hi")); 
    }
    
}
