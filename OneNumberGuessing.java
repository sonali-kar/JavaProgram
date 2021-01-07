//import java.util.Random;
import java.util.Scanner;

//import jdk.internal.module.SystemModuleFinders;

//import java.lang;


public class OneNumberGuessing
{
    //method

    public static void guessingnumbergame()
    {
        //scanner class
        Scanner sc = new Scanner(System.in);
      
      // generating random numbers
      int number = 1 + (int)(100* Math.random()); 

      //trials
      int k = 5;
      int guess,i;
      System.out.println("A number between 1 to 100 is chosen,guess the number within 5 trials");
      for(i=0;i<=k-1;i++)
      {
          System.out.println("Guess the number");
          guess = sc.nextInt();       //input taken
           if(number==guess)
           {
               System.out.println("Congratulations!you have guessed the number");
               break;
           } 
           else if (number > guess && i != k - 1)
            { 
                System.out.println("The number is greater than " + guess); 
            } 
            else if (number < guess && i != k - 1) 
            { 
                System.out.println("The number is less than" + guess); 
            } 
            else if (i == k-1) 
         { 
           System.out.println("You have exhausted all the trials");
           System.out.println("The number was " + number); 
           break;
        }
      }
      
    }


    public static void main(String[] args)   
      { 
         guessingnumbergame(); // Function Call 
      } 

} 

