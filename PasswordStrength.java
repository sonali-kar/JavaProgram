import java.util.Scanner;
public class PasswordStrength {
    public static void main(String args[])
    {
        while(true){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password");
        String s = sc.next();
        int uppercase=0,lowercase=0,digits=0,specialcharacter=0;
        char[] password = s.toCharArray();
        for(int i = 0;i<s.length();i++)
        {
            if (Character.isUpperCase(password[i]))
            {
                uppercase = 1;
            }
            if (Character.isLowerCase(password[i]))
            {
                lowercase = 1;
            }
            if (Character.isDigit(password[i]))
            {
                digits = 1;
            }
        }
        if (s.contains("~") || s.contains("!") || s.contains("@")
        || s.contains("#") || s.contains("$") || s.contains("%")
        || s.contains("^") || s.contains("&") || s.contains("*")) ;
        {
            specialcharacter = 1;
        }
        //minimum length of a password is 8 characters
        if (s.length() < 8)
        {
            System.out.println("Too Short");
        }

            //strong if it contains a uppercase ,lowercase,digits and a soecial character 
        else if (s.length() >= 8 && (uppercase == 1) && (lowercase == 1) && (digits == 1) && (specialcharacter == 1))   
        {
            System.out.println("Strong");
            break;
        }  

        else if ((s.length() >= 8 && (((uppercase == 1) && (lowercase == 1)) || (digits == 1) && (specialcharacter == 1)))
            &&
            (s.length() >= 8 && (((uppercase == 1) && (lowercase == 1)) && (digits == 1) || (specialcharacter == 1))))

            System.out.println("Medium");

            else //if (s.length() >= 8 && (((uppercase == 1) && (lowercase == 1)) || (digits == 1) || (specialcharacter == 1)))

            System.out.println("Weak");


            

    }
    }
    
}
