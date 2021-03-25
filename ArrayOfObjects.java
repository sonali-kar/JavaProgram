import java.util.Scanner;
public class ArrayOfObjects  
{  
public static void main(String args[])  
{  
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Number of Student: ");

    int Students = input.nextInt();
    Library[] obj = new Library[Students] ;  

    for(int i=0;i<Students;i++){
        
        System.out.print("Enter Library Card Number: ");
        int number = input.nextInt();
        
        System.out.print("Enter Card Holder Name: ");
        String name = input.next();
        obj[i]=new Library(number,name);
    }
    
    
    for(int i=0;i<Students;i++){
        System.out.println("Card Detail of "+ i+1+ " user");  
        obj[i].display();
    }
}  
}  
 
class Library  
{  
int card_num;  
String holder_name;  
Library(int num, String name)  
{  
card_num = num;  
holder_name = name;  
}  
public void display()  
{  
System.out.print("Libary Card Number = "+card_num + "  " + " Card Holder Name = "+holder_name);  
System.out.println();  
}  
}