import java.util.Scanner;
public class BackAround {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine();
        System.out.println(s.charAt(s.length()-1)+s+s.charAt(s.length()-1));
    }
    
}
