import java.util.Scanner;
public class StringSwap {
    
  
        // Function that swap first and 
        // the last character of a string 
        public static String swapFirstAndLast(String s) 
        { 
            
            if (s.length() < 2) 
                return s; 
            char[] ch = s.toCharArray(); 
            char temp = ch[0];                //swap
            ch[0] = ch[ch.length - 1]; 
            ch[ch.length - 1] = temp; 
            return String.valueOf(ch); 
        } 
       
        public static void main(String args[]) 
        { 
            // Given String str 
            Scanner sc = new Scanner(System.in);
            System.out.println("enter string");
            String s = sc.nextLine(); 
      
            // Function Call 
            System.out.println(swapFirstAndLast(s)); 
        } 
    
    
}