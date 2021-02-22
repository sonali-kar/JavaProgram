import java.util.Scanner;
    public class IndianPremierLeague
        {
            

            
                public static void input() {
                    
                    
                    String name;
                    String teamName;
                    int age;  
                                 
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter Name");
                    name = sc.nextLine();
                    System.out.println("Enter TeamName");
                    teamName = sc.nextLine();
                    System.out.println("Enter Age");
                    age = sc.nextInt();
                   
                    display(name,teamName,age);
                }
                    
                
    
                public static void display(String name,String teamName,int age)
                {
    
                    System.out.println("The details of IPL player: " + "\n" + " Name : " + name + "\n" + "Team Name: " + teamName + "\n" + "Age: " + age + "\n" 
                    + "Specialization"+ speciality);
                }
                public static void main(String args[])
                {
                input();
                }
           }
    
            



            
        
