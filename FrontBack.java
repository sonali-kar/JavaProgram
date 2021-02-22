import java.util.Scanner;
public class FrontBack {
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter string");
       String s = sc.nextLine();
       if (s.length() == 0){
        System.out.println("Can't be replaced");
    }
     else{
    char beginning = s.charAt(0);
    char end = s.charAt(s.length() - 1);

    s.replace(beginning, end);
    String str = s.replace(end, beginning);

    System.out.println(str);
     }
   } 
}
