import java.util.Scanner;

public class AlphabetDigitSpecial{
    public static void main(String args[])
    {    
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character");
        char ch = sc.next().charAt(0);
        
        //FOR ALPHABET
        if ((ch >= 65 && ch<= 90) || (ch >= 97 && ch <= 122)) 
            System.out.println(" Alphabet "); 
  
        //  FOR DIGITS 
        else if (ch >= 48 && ch <= 57) 
            System.out.println(" Digit "); 
  
        //  SPECIAL CHARACTER 
        else
            System.out.println(" Special Character ");
            
             
        
    }
}
