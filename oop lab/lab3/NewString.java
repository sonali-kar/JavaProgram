import java.util.Scanner;
import java.util.Scanner;
public class NewString{
    static String lastUp(String str) 
    {
        int len = str.length();
        
        if (len <= 3)
          return str.toUpperCase();
        else
         {
          String temp = str.substring(len - 3, len);
          return str.substring(0, len - 3) + temp.toUpperCase();
        }
    }

      public static void main(String args[])
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter string");
          String str = sc.nextLine(); 
          System.out.println(lastUp(str));
      }
}