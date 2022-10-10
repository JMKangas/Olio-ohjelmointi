
import java.util.*;

public class game {

    public static void main(String[] args) {


        //Player game where you can choose your own name and your own clan.
        Scanner input = new Scanner(System.in);
        try {

            System.out.println("Welcome to the game!");
            System.out.println("Please enter your Username: ");
            String userName = input.next();
            System.out.println("Please enter your Password: ");
            String pswd1 = input.next();
            System.out.println("Please re-enter your Password: ");
            String pswd2 = input.next();

            //If the passwords don't match, the program will ask you to re-enter the passwords.
            while (password(pswd1, pswd2) == false) {
                System.out.println("The passwords don't match!");
                System.out.println("Please re-enter your Password: ");
                pswd1 = input.next();
                System.out.println("Please re-enter your Password: ");
                pswd2 = input.next();
            } 

            System.out.println("Password is " + pswd1);
         
            //If the passwords match, the program will ask you to enter your firstname and lastname.
            if (pswd1.equals(pswd2)) {
                System.out.println("Please enter your firstname: ");
                String firstName = input.next();
                System.out.println("Please enter your lastname: ");
                String lastName = input.next();

                //The program will ask you to choose your clan.
                System.out.println("Please choose your clan: ");
                System.out.println("1. WarriorPlayer clan");
                System.out.println("2. PeaceMakerPlayer clan");
                int character = input.nextInt();

                
                while(choiceCheck(character) == false) {
                    System.out.println("\n" + "You need to choose 1 or 2!" + "\n");
                    System.out.println("Please choose your clan: ");
                    System.out.println("1. WarriorPlayer clan");
                    System.out.println("2. PeaceMakerPlayer clan");
                    character = input.nextInt();
                }

                if (character == 1) {

                    WarriorPlayer warrior = new WarriorPlayer(firstName, lastName, userName, pswd1);
                    System.out.println("You have chosen the WarriorPlayer clan player " + warrior.getUserName() + "! ");
                    System.out.println(warrior.caveManGreeting() + " WAR IS COMING! " + warrior.getUserName() + "!" );
                    warrior.greeting();
                 

                } else if (character == 2) {

                    PeaceMakerPlayer peaceMaker = new PeaceMakerPlayer(firstName, lastName, userName, pswd1);                
                    System.out.println("Your team is: " + peaceMaker.getTeam() + " player " + peaceMaker.getUserName() + "!");
                    System.out.println("Peace!" + peaceMaker.peaceGreeting() + " Good health mate! " + peaceMaker.goodHealtGreeting());
                    peaceMaker.greeting();
                  
                } 
            }

        input.close();
        }
        catch (Exception e) {

                System.out.println("Error: " + e.toString());

             
        } finally {

                System.out.println("Thank you for playing!");
        }     
    }

    //*** Couple simple methods to check the passwords and the choice of the clan. ***//
    
    //Check if passwords are the same
    public static Boolean password(String pswd1, String pswd2) {
        
        try {

            Boolean password;
        
            if (pswd1.equals(pswd2)) {
    
                password = true;
    
            } else {
                 
                password = false;
    
            }
            return password;

        } catch (Exception e) {

            System.out.println("Error: " + e.toString());
            return false;
        }
    }
    
    //Check if user input equals to 1 or 2
    public static boolean choiceCheck(int character) {

        try {

            if (character == 1 || character == 2) {

                return true;
    
            } else {
    
                return false;
    
            }

        } catch (Exception e) {

            System.out.println("Error: " + e.toString());
            return false;
        }
    }

}
